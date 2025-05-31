package FactoryDesignpattern;

import java.util.ArrayList;

public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public void prepare() {

        System.out.println("Preparing " + name);
        System.out.println("Dough: " + dough);
        System.out.println("Sauce: " + sauce);
        System.out.println("Toppings: " + toppings);
        for (Object topping : toppings) {
            System.out.println("Topping: " + topping);
        }
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public String getName() {
        return name;
    }
}
