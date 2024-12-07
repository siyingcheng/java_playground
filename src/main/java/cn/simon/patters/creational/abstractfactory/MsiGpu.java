package cn.simon.patters.creational.abstractfactory;

public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Assembling MSI GPU");
    }
}
