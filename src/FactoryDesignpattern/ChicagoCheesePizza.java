package FactoryDesignpattern;

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
