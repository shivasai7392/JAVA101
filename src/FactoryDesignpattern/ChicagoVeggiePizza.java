package FactoryDesignpattern;

public class ChicagoVeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ChicagoVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        name = "Chicago Style Deep Dish Veggie Pizza";
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
