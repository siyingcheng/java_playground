package cn.simon.patters.creational.abstractfactory;

public class MsiMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Assembling MSI monitor");
    }
}
