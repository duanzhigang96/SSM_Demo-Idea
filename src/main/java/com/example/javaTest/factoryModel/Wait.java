package com.example.javaTest.factoryModel;

import org.junit.jupiter.api.Test;

public class Wait {
    public static final int MENU_MEET = 1;
    public static final int MENU_DUCK = 2;
    public static final int MENU_FISH = 3;

    public static Hotel getMenu(int menuType) {
        switch (menuType) {
            case MENU_MEET:
                return new Meet();
            case MENU_DUCK:
                return new Duck();
            case MENU_FISH:
                return new Fish();
            default:
                return null;
        }
    }

    @Test
    public void testFactory() {
        Hotel hotel = Wait.getMenu(Wait.MENU_FISH);
        hotel.cook();
    }

}
