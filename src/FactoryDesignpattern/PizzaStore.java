package FactoryDesignpattern;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // Factory method - subclasses will implement this to create the right objects
    protected abstract Pizza createPizza(String type);
}
