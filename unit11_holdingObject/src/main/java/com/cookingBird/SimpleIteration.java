package com.cookingBird;

import java.util.Iterator;
import java.util.List;

public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);

        Iterator<Pet> iterator = pets.iterator();

        while (iterator.hasNext()) {
            Pet pet = iterator.next();
            System.out.println(pet.getId() + " " + pet);
        }

        for (Pet pet : pets){
            System.out.println(pet.getId() + " " + pet);
        }

        iterator = pets.iterator();
        System.out.println(pets.size());
        for (int i = 0; i < pets.size(); i++) {
            System.out.println(i);
            iterator.next();
            iterator.remove();
        }

        System.out.println(pets);
    }
}
