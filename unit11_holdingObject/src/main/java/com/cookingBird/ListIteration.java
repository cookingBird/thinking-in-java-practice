package com.cookingBird;

import java.util.List;
import java.util.ListIterator;

public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);
        ListIterator<Pet> it = pets.listIterator();
        while (it.hasNext()){
            System.out.println(it.next()+". "+it.nextIndex()+". "+it.previousIndex()+ ";");
        }
        System.out.println();
        while (it.hasPrevious()){
            System.out.println(it.previous().getId()+ " ");
        }
        System.out.println();
        it = pets.listIterator(3);
        while (it.hasNext()){
            it.next();
            it.set(Pets.randomPet());
        }
        System.out.println(pets);
    }
}
