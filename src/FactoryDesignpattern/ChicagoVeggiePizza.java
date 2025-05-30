package FactoryDesignpattern;

public class ChicagoVeggiePizza extends Pizza {
    public ChicagoVeggiePizza() {
        name = "Chicago Style Deep Dish Veggie Pizza";
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
