package FactoryDesignpattern;

public class NYCheesePizza extends Pizza {
    public NYCheesePizza() {
        name = "NY Style Cheese Pizza";
        dough = "Extra Thick Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Mozzarella");
    }
}
