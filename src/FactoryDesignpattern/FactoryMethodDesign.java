package FactoryDesignpattern;

public class FactoryMethodDesign {
    public static void main(String[] args) {
        // Create NY style pizza using NYPizzaStore
        PizzaStore nyStore = new NYPizzaStore(new NYPizzaIngredientFactory());
        Pizza nyPizza = nyStore.orderPizza("cheese");
        System.out.println(nyPizza.getName());

        // Create Chicago style pizza using ChicagoPizzaStore
        PizzaStore chicagoStore = new ChicagoPizzaStore(new ChicagoPizzaIngredientFactory());
        Pizza chicagoPizza = chicagoStore.orderPizza("cheese");
        System.out.println(chicagoPizza.getName());
    }
}
