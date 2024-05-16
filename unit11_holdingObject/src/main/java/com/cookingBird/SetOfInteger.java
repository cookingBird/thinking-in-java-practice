package com.cookingBird;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(55);
        Set<Integer> integerSet = new HashSet<>();

        for (int i = 0; i < 10000; i++) {
            integerSet.add(random.nextInt(30));
        }
        System.out.println(integerSet);
    }
}
