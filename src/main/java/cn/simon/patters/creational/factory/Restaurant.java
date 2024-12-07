package cn.simon.patters.creational.factory;

public abstract class Restaurant {
    public Burger oderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger createBurger();
}
