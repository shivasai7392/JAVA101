package TemplateDesignPattern;

public class Coffee extends Caffeinebeverage {
    @Override
    void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding condiments for coffee");
    }
}
