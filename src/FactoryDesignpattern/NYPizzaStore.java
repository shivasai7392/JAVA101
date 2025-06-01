package FactoryDesignpattern;

public class NYPizzaStore extends PizzaStore {
    PizzaIngredientFactory ingredientFactory;

    public NYPizzaStore(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYCheesePizza(ingredientFactory);
        }
        else if (type.equals("pepperoni")) {
            pizza = new NYPepperoniPizza(ingredientFactory);
        }
        else if (type.equals("veggie")) {
            pizza = new NYVeggiePizza(ingredientFactory);
        }
        return pizza;
    }
}