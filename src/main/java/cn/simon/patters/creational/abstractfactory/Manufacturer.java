package cn.simon.patters.creational.abstractfactory;

public abstract class GpuManufacturer {
    public Component assembleGpu() {
        Component gpu = createGpu();
        gpu.assemble();
        return gpu;
    }

    public abstract Component createGpu();
}
