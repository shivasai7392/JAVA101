package IteratotDesignPattern;

import java.util.Hashtable;
import java.util.Iterator;

public class DessertMenu implements Menu{

    Hashtable<String, MenuItem> menuItems = new Hashtable<String, MenuItem>();

    public DessertMenu() {
        addItem("Chocolate", "Chocolate Burger", 1.99, false);
        addItem("Vannilla", "Vanilla Burger", 1.99, false);
        addItem("Blueberry", "Blueberry Burger", 1.99, false);
    }

    @Override
    public Iterator<MenuItem> createiterator() {
        return this.menuItems.values().iterator();
    }

    public void addItem(String name, String description, double price, boolean vegetarian) {
        MenuItem menuItem = new MenuItem(name, description, price, vegetarian);
        menuItems.put(name, menuItem);
    }
}
