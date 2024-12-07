package cn.simon.patters.creational.factory;

public class SimpleBurgerFactory {
    public Burger createBurger(String type) {
        Burger burger = null;
        if ("BEEF".equals(type)) {
            burger = new BeefBurger();
        } else if ("CHICKEN".equals(type)) {
            burger = new ChickenBurger();
        } else if ("VEGGIE".equals(type)) {
            burger = new VeggieBurger();
        }
        return burger;
    }
}
