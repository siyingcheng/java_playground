package cn.simon.patters.creational.factory;

public class ChickenBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing chicken burger");
    }
}
