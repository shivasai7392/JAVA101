package FactoryDesignpattern;

public class ChicagoCheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ChicagoCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "Chicago Style Deep Dish Cheese Pizza";
        toppings.add("Chicago Style");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
    }
}
