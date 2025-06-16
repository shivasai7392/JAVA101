package IteratotDesignPattern;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

    MenuItem[] menuItemArray;
    int position = 0;
    public DinerMenuIterator(MenuItem[] menuItemArray) {
        this.menuItemArray = menuItemArray;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItemArray.length || menuItemArray[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
       MenuItem menuItem = menuItemArray[position];
       position++;
       return menuItem;
    }
}
