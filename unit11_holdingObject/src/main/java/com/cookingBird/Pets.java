package com.cookingBird;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pets {
    private static  final Random random = new Random();

    public static List<Pet> arrayList(int num) {
        ArrayList<Pet> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(i, new Pet(i));
        }
        return list;
    }

    public static Pet randomPet(){
        return new Pet(random.nextInt(100));
    }

}
