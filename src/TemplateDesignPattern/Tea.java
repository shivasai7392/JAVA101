package TemplateDesignPattern;

public class Tea extends Caffeinebeverage {
    @Override
    void brew() {
        System.out.println("Brewing in Tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding condiments for Tea");
    }
}
