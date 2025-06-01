package FactoryDesignpattern;

public class NYPepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public NYPepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "NY Style Pepperoni Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
