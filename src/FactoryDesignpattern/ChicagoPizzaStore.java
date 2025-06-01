package FactoryDesignpattern;

public class ChicagoPizzaStore extends PizzaStore {
    PizzaIngredientFactory ingredientFactory;

    public ChicagoPizzaStore(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza(this.ingredientFactory);
        }
        else if (type.equals("pepperoni")) {
            pizza = new ChicagoPepperoniPizza(this.ingredientFactory);
        }
        else if (type.equals("veggie")) {
            pizza = new ChicagoVeggiePizza(this.ingredientFactory);
        }
        return pizza;
    }
}