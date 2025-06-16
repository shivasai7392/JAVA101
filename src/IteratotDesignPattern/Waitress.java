package IteratotDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        DinerMenuIterator dinerMenuIterator = this.dinerMenu.iterator();
        printMenu(dinerMenuIterator);
        PancakeHouseMenuIterator pancakeHouseMenuIterator = this.pancakeHouseMenu.iterator();
        printMenu(pancakeHouseMenuIterator);
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
