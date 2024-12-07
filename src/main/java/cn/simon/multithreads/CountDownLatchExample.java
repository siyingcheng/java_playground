package cn.simon.multithreads;

import java.util.concurrent.CountDownLatch;

class Worker extends Thread {
    private CountDownLatch latch;
    private String name;

    public Worker(CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is working...");
            Thread.sleep((long) (Math.random() * 1000)); // 模拟工作时间
            System.out.println(name + " has finished work.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown(); // 减少计数器
        }
    }
}

public class CountDownLatchExample {
    public static void main(String[] args) {
        int numberOfWorkers = 3;
        CountDownLatch latch = new CountDownLatch(numberOfWorkers);

        System.out.println("Starting workers...");

        for (int i = 1; i <= numberOfWorkers; i++) {
            new Worker(latch, "Worker " + i).start();
        }

        try {
            latch.await(); // 主线程等待，直到Worker线程完成
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All workers have finished. Main thread proceeding.");
    }
}