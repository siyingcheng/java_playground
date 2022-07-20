package org.syc.demos;

import org.syc.utils.TimeUtils;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static void main(String[] args) {
        TimeUtils.check("Get fibonacci by recursively", () -> System.out.println(fibonacci(65)));
        TimeUtils.check("Get fibonacci by loop", () -> System.out.println(fibonacci2(65)));
        TimeUtils.check("Get fibonacci by math", () -> System.out.println(fibonacci3(65)));
    }

    /**
     * Returns the nth term of Fibonacci sequence by math.
     *
     * @param n the nth term
     * @return the nth term of Fibonacci sequence
     */
    public static long fibonacci3(long n) {
        double c = Math.sqrt(5);
        return (long) ((Math.pow((1 + c) / 2, n) - Math.pow((1 - c) / 2, n)) / c);
    }

    /**
     * calculate fibonacci by loop
     *
     * @param n a positive integer
     * @return the nth fibonacci value
     */
    public static long fibonacci2(long n) {
        if (n <= 1) {
            return n;
        }
        long first = 0;
        long second = 1;
        long sum;
        for (int i = 1; i < n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }

    private static Map<Long, Long> fibCacheMap = new HashMap<>();

    /**
     * calculate fibonacci by recursively
     *
     * @param n a positive integer
     * @return the nth fibonacci value
     */
    public static long fibonacci(long n) {
        if (n <= 1) {
            return n;
        }
        // cache
        Long result = fibCacheMap.get(n);
        if (result == null) {
            result = fibonacci(n - 1) + fibonacci(n - 2);
            fibCacheMap.put(n, result);
        }
        return result;
    }
}
