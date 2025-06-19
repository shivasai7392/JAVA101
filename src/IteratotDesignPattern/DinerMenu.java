package IteratotDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class DinerMenu implements Menu {


    static final int MAX_ITEMS = 6;
    MenuItem[] menuItems;
    int numberOfItems = 0;
    DessertMenu dessertMenu;

    public DinerMenu() {
        this.dessertMenu = new DessertMenu();
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian", "Vegetarian", 0.95, true);
        addItem("Sandwich", "Sandwich", 0.95, true);
        addItem("Sandwich", "Sandwich", 0.95, true);
        addItem("Sandwich", "Sandwich", 0.95, true);
    }

    public void addItem(String name, String description, double price, boolean vegetarian) {
        MenuItem menuItem = new MenuItem(name, description, price, vegetarian);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Maximum number of items reached");
        }
        else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator<MenuItem> createiterator() {
        ArrayList<MenuItem> items = new ArrayList<MenuItem>();
        items.addAll(items);
        items.addAll(this.dessertMenu.menuItems.values());
        return new DinerMenuIterator(menuItems);
    }
}
