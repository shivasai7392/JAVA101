package FactoryDesignpattern;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        }
        else if (type.equals("pepperoni")) {
            pizza = new ChicagoPepperoniPizza();
        }
        else if (type.equals("veggie")) {
            pizza = new ChicagoVeggiePizza();
        }
        return pizza;
    }
}