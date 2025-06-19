package IteratotDesignPattern;

import java.util.ArrayList;

public class MenuTestdrive {
    public static void main(String[] args) {

        MenuComponent allMenus = new Menu("All MENUS", "All Menus Combined");

        MenuComponent dinnerMenu = new DinerMenu();
        allMenus.add(dinnerMenu);

        MenuComponent dessertMenu = new DessertMenu();
        dinnerMenu.add(dessertMenu);

        MenuComponent CafeMenu = new CafeMenu();
        allMenus.add(CafeMenu);

        MenuComponent pancakeHouseMenu = new PancakeHouseMenu();
        allMenus.add(pancakeHouseMenu);

        allMenus.print();


    }
}
