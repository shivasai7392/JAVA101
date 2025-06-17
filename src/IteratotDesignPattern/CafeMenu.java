package IteratotDesignPattern;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {

    Hashtable<String, MenuItem> menuItems = new Hashtable<String, MenuItem>();

    public CafeMenu() {
        addItem("Veggie", "Veggie Burger", 1.99, false);
        addItem("Cheese", "Cheese Burger", 1.99, false);
        addItem("Sauce", "Sauce Burger", 1.99, false);
        addItem("Pepsi", "Pepsi Burger", 1.99, false);
        addItem("Coffee", "Coffee Burger", 1.99, false);
        addItem("Milk", "Milk Burger", 1.99, false);
        addItem("Chicken", "Chicken Burger", 1.99, false);
        addItem("Pepsi", "Pepsi Burger", 1.99, false);
    }

    public void addItem(String name, String description, double price, boolean vegetarian) {
        MenuItem menuItem = new MenuItem(name, description, price, vegetarian);
        menuItems.put(name, menuItem);
    }

//    public Hashtable<String, MenuItem> getMenuItems() {
//        return menuItems;
//    }

    @Override
    public Iterator createiterator() {
        return menuItems.values().iterator();
    }
}
