package cn.simon.patters.creational.abstractfactory;

public class ManufacturerApplication {
    public static void main(String[] args) {
        MsiManufacturer msiManufacturer = new MsiManufacturer();
        msiManufacturer.createGpu().assemble();
        msiManufacturer.createMonitor().assemble();

        AsusManufacturer asusManufacturer = new AsusManufacturer();
        asusManufacturer.createGpu().assemble();
        asusManufacturer.createMonitor().assemble();
    }
}
