package FactoryDesignpattern;

public class ChicagoPepperoniPizza extends Pizza {
    public ChicagoPepperoniPizza() {
        name = "Chicago Style Deep Dish Pepperoni Pizza";
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
