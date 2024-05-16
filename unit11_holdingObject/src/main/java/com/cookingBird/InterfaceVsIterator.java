package com.cookingBird;

import java.util.*;

public class InterfaceVsIterator {
    static void display(Iterator<Pet> iterator){
        while (iterator.hasNext()){
            Pet pet = iterator.next();
            System.out.println(pet);
        }
        System.out.println();
    }
    static  void display(Collection<Pet> collection){
        for (Pet pet:collection){
            System.out.println(pet);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pet> petList = Pets.arrayList(9);
        Set<Pet> petSet = new HashSet<Pet>(petList);
        Map<String, Pet> petMap = new LinkedHashMap<>();
        String[] names = {"Ralph", "Bob", "Odie", "Bowser", "Sammy"};

        for (int i = 0; i < names.length; i++){

            petMap.put(names[i], petList.get(i));
        }
        display(petList);
        display(petSet);
        display(petList.iterator());
        display(petSet.iterator());
        System.out.println(petMap);
        System.out.println(petMap.keySet());
        display(petMap.values());
        display(petMap.values().iterator());
    }
}
