package com.cookingBird;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Apple {
    private static long counter;
    private final long id = counter++;

    public long getId() {
        return id;
    }
}

class Orange {

}

public class ApplesAndOrangeWithoutGenerics {

    public static void main(String[] args) {
        ArrayList<Apple> arrays = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            arrays.add(new Apple());
        }
//        arrays.add(new Orange());
        for (int i = 0; i < arrays.size(); i++) {
            System.out.println((arrays.get(i)).getId());
        }
    }
}
