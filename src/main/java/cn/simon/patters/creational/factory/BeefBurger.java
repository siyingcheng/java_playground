package cn.simon.patters.creational.factory;

public class BeefBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing beef burger");
    }
}
