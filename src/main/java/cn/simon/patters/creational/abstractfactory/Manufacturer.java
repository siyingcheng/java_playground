package cn.simon.patters.creational.abstractfactory;

public abstract class Manufacturer {
    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();
}
