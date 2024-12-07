package cn.simon.patters.creational.factory;

public class VeggieBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
