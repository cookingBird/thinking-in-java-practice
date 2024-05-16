package com.cookingBird;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class ListFeatures {
    public static void main(String[] args) {
        Random random = new Random(50);
        Collection<Integer> collection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            collection.add(random.nextInt(i + 10));
        }

        collection.retainAll(Collections.singleton(99));

    }
}
