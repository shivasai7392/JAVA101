package IteratotDesignPattern;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu extends Menu {

    Hashtable<String, MenuItem> menuItems = new Hashtable<String, MenuItem>();

    public CafeMenu() {
        super("Cafe Menu", "Menu for Cafe");
        add(new MenuItem("Veggie", "Veggie Burger", 1.99, false));
        add(new MenuItem("Cheese", "Cheese Burger", 1.99, false));
        add(new MenuItem("Sauce", "Sauce Burger", 1.99, false));
        add(new MenuItem("Pepsi", "Pepsi Burger", 1.99, false));
        add(new MenuItem("Coffee", "Coffee Burger", 1.99, false));
        add(new MenuItem("Milk", "Milk Burger", 1.99, false));
        add(new MenuItem("Chicken", "Chicken Burger", 1.99, false));
        add(new MenuItem("Pepsi", "Pepsi Burger", 1.99, false));
    }

}
