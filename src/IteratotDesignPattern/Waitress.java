package IteratotDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        for (Menu menu : menus) {
            printMenu(menu.createiterator());
        }
    }

    public void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getDescription());
            System.out.println(menuItem.getPrice());
        }
    }


}
