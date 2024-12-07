package cn.simon.patters.creational.prototype;

public class MyCar implements Prototype<MyCar> {
    private String brand;
    private String color;
    private String model;
    private int topSpeed;

    public MyCar() {

    }

    public MyCar(MyCar car) {
        this.brand = car.brand;
        this.color = car.color;
        this.model = car.model;
        this.topSpeed = car.topSpeed;
    }

    @Override
    public MyCar clone() {
        return new MyCar(this);
    }

    // ... Add getters and setters
}
