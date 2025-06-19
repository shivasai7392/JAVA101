package IteratotDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class DinerMenu extends Menu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;

    public DinerMenu() {
        super("Dinner Menu", "Menu for Dinner");
        add(new MenuItem("Vegetarian", "Vegetarian", 0.95, true));
        add(new MenuItem("Sandwich", "Sandwich", 0.95, true));
        add(new MenuItem("Sandwich", "Sandwich", 0.95, true));
        add(new MenuItem("Sandwich", "Sandwich", 0.95, true));
    }


}
