package IteratotDesignPattern;

import java.util.Hashtable;
import java.util.Iterator;

public class DessertMenu extends Menu{

    Hashtable<String, MenuItem> menuItems = new Hashtable<String, MenuItem>();

    public DessertMenu() {
        super("Dessert Menu", "Menu for Dessert");
        add(new MenuItem("Chocolate", "Chocolate Burger", 1.99, false));
        add(new MenuItem("Vannilla", "Vanilla Burger", 1.99, false));
        add(new MenuItem("Blueberry", "Blueberry Burger", 1.99, false));
    }
}
