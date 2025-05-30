package FactoryDesignpattern;

public class FactoryMethodDesign {
    public static void main(String[] args) {
        // Create NY style pizza using NYPizzaStore
        PizzaStore nyStore = new NYPizzaStore();
        Pizza nyPizza = nyStore.orderPizza("cheese");
        System.out.println("Ordered a NY style cheese pizza\n");

        // Create Chicago style pizza using ChicagoPizzaStore
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza chicagoPizza = chicagoStore.orderPizza("cheese");
        System.out.println("Ordered a Chicago style cheese pizza\n");
    }
}
