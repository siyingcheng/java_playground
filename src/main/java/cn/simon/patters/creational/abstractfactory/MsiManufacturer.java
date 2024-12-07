package cn.simon.patters.creational.abstractfactory;

public class MsiManufacturer extends Manufacturer {

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
