package com.cookingBird;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOfInt {
    public static void main(String[] args) {
        Random random = new Random(47);

        SortedSet<Integer> sortedSet = new TreeSet<>();

        for (int i = 0; i < 100_000; i++) {

            sortedSet.add(random.nextInt(30));
        }
        System.out.println(sortedSet);
    }
}
