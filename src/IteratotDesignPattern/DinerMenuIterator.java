package IteratotDesignPattern;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] menuItemArray;
    int position = 0;
    public DinerMenuIterator(MenuItem[] menuItemArray) {
        this.menuItemArray = menuItemArray;
    }

    @Override
    public boolean hasNext() {
        return position < menuItemArray.length && menuItemArray[position] != null;
    }

    @Override
    public MenuItem next() {
       MenuItem menuItem = menuItemArray[position];
       position++;
       return menuItem;
    }
}
