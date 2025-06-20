package IteratotDesignPattern;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        this.allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = this.allMenus.getIterator();
        System.out.println("Vegetarian Menu");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try{
                if (menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }
            catch (UnsupportedOperationException e){}
        }
    }
}
