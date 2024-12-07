package cn.simon.patters.creational.abstractfactory;

public class AsusManufacturer extends Manufacturer {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
