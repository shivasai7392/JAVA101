package FactoryDesignpattern;

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Chicago Style Dough";
        sauce = "Chicago Style Sauce";
        toppings.add("Chicago Style");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
