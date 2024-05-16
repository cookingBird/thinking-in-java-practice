package com.cookingBird;

import java.util.*;
import java.util.stream.Collectors;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collections = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9};
        collections.addAll(Arrays.asList(moreInts));
        Collections.addAll(collections, 10, 11, 12);
        Collections.addAll(collections,moreInts);
        System.out.println(collections);
        List<Integer> list = Arrays.asList(16, 17, 18, 19);
        list.set(1,15);
        // runtime error, because the underlying array cannot be resized
//        list.add(20);
        System.out.println(list);
    }
}
