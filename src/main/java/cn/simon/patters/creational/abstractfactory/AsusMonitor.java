package cn.simon.patters.creational.abstractfactory;

public class AsusMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Asus Monitory assembled");
    }
}
