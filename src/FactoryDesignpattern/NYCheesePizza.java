package FactoryDesignpattern;

public class NYCheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public NYCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "NY Style Cheese Pizza";
        toppings.add("Grated Mozzarella");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing NY Style Cheese Pizza");
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
    }
}
