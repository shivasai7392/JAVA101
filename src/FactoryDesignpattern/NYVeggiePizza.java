package FactoryDesignpattern;

public class NYVeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public NYVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "NY Style Veggie Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing NY Style Veggie Pizza");
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
    }
}
