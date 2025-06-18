package IteratotDesignPattern;

import java.util.ArrayList;

public class MenuTestdrive {
    public static void main(String[] args) {
        ArrayList<Menu> menuArrayList = new ArrayList<>();

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        menuArrayList.add(pancakeHouseMenu);
        DinerMenu dinerMenu = new DinerMenu();
        menuArrayList.add(dinerMenu);
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(menuArrayList);
        waitress.printMenu();
    }
}
