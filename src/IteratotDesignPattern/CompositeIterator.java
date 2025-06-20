package IteratotDesignPattern;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        }
        else {
            Iterator<MenuComponent> it = (Iterator<MenuComponent>) stack.peek();
            if (!it.hasNext()) {
                stack.pop();
                return hasNext();
            }
            else {
                return true;
            }
        }
    }

    @Override
    public MenuComponent next() {
        if (!hasNext()) {
            return null;
        }
        Iterator<MenuComponent> iterator = (Iterator<MenuComponent>) stack.peek();
        MenuComponent menuComponent = iterator.next();
        if (menuComponent instanceof Menu){
            stack.push(menuComponent.getIterator());
        }
        return menuComponent;
    }

}
