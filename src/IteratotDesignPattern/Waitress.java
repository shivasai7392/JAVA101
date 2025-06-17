package IteratotDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

    private Menu pancakeHouseMenu;
    private Menu dinerMenu;
    private Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator dinerMenuIterator = this.dinerMenu.createiterator();
        printMenu(dinerMenuIterator);
        Iterator pancakeHouseMenuIterator = this.pancakeHouseMenu.createiterator();
        printMenu(pancakeHouseMenuIterator);
        Iterator cafeMenuIterator = this.cafeMenu.createiterator();
        printMenu(cafeMenuIterator);
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
