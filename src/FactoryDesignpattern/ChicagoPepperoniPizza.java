package FactoryDesignpattern;

public class ChicagoPepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ChicagoPepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        name = "Chicago Style Deep Dish Pepperoni Pizza";
        this.ingredientFactory = ingredientFactory;
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
