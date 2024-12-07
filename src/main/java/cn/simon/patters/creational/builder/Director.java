package cn.simon.patters.creational.builder;


public class Director {
    public void buildBugatti(CarBuilder builder) {
        builder.brand("Bugatti")
                .model("Veyron")
                .color("Black");
    }

    public void buildLamborghini(CarBuilder builder) {
        builder.brand("Lamborghini")
                .color("Yellow")
                .model("Aventador");
    }
}
