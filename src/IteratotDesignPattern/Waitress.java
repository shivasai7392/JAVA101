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
        ArrayList<MenuItem> menuItems = pancakeHouseMenu.getMenuItems();
        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getDescription());
            System.out.println(menuItem.getPrice());
        }

        MenuItem[] menuItemArray = dinerMenu.getMenuItems();
        for (MenuItem menuItem : menuItemArray) {
            if (menuItem != null) {
                System.out.println(menuItem.getName());
                System.out.println(menuItem.getDescription());
                System.out.println(menuItem.getPrice());
            }
        }

    }


}
