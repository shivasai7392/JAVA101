package IteratotDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu extends Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        super("PancakeHouse Menu", "Menu for PancakeHouse");
        this.menuItems = new ArrayList<MenuItem>();
        add(new MenuItem("K&B's Pancake Breakfast", "Pancake with scrambled eggs, and toast", 2.99, true));
        add(new MenuItem("Regular Pancake Breakfast", "Pancake with fried eggs, sausage", 2.99, true));
        add(new MenuItem("K&B's Pancake Breakfast", "Pancake with scrambled eggs, and toast", 2.99, true));
        add(new MenuItem("K&B's Pancake Breakfast", "Pancake with scrambled eggs, and toast", 2.99, true));
    }
}
