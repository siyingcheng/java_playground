package cn.simon.patters.creational.factory;

public class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Burger");
    }
}
