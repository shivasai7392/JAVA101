package FactoryDesignpattern;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYCheesePizza();
        }
        else if (type.equals("pepperoni")) {
            pizza = new NYPepperoniPizza();
        }
        else if (type.equals("veggie")) {
            pizza = new NYVeggiePizza();
        }
        return pizza;
    }
}