package cn.simon.patters.creational.factory;

public class RestaurantApplication {
    public static void main(String[] args) {
        Burger beefBurger = new BeefBurgerRestaurant().createBurger();
        Burger chickenBurger = new ChickenBurgerRestaurant().createBurger();
        Burger veggieBurger = new VeggieBurgerRestaurant().createBurger();
    }
}
