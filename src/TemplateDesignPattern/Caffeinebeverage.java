package TemplateDesignPattern;

public abstract class Caffeinebeverage {
    void prepareReciepe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring in cup");
    }
}
