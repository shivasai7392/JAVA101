package IteratotDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<MenuItem>();
        addItem("K&B's Pancake Breakfast", "Pancake with scrambled eggs, and toast", 2.99, true);
        addItem("Regular Pancake Breakfast", "Pancake with fried eggs, sausage", 2.99, true);
        addItem("K&B's Pancake Breakfast", "Pancake with scrambled eggs, and toast", 2.99, true);
        addItem("K&B's Pancake Breakfast", "Pancake with scrambled eggs, and toast", 2.99, true);
    }

    public void addItem(String name, String description, double price, boolean vegetarian) {
        MenuItem menuItem = new MenuItem(name, description, price, vegetarian);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createiterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
