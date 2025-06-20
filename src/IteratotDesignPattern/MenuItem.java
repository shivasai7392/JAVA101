package IteratotDesignPattern;

import java.util.Iterator;

public class MenuItem extends MenuComponent{
    String name;
    String description;
    double price;
    boolean vegetarian;

    public MenuItem(String name, String description, double price, boolean vegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        if (vegetarian) {
            System.out.print("V");
        }
        System.out.print(" Name: " + this.getName());
        System.out.print("," + this.getDescription());
        System.out.print("," + this.getPrice()+"\n\n");
    }

    @Override
    public Iterator<MenuComponent> getIterator() {
        return new NullIterator();
    }
}
