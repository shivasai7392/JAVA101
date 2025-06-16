package IteratotDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position < menuItems.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return menuItems.get(position++);
    }
}
