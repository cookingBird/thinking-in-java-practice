package com.cookingBird;

import java.util.LinkedList;

public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(12));
        System.out.println("element: " + pets.element());
        System.out.println("getFirst: " + pets.getFirst());
        // only differs in empty list
        System.out.println("peek: " + pets.peek());


        System.out.println("removeFirst: " + pets.removeFirst());
        System.out.println("remove: " + pets.remove());
        // only differ in empty list
        System.out.println("poll: " + pets.poll());

        System.out.println("after remove: " + pets);
        pets.addFirst(new Pet(88));
        System.out.println("after addFirst: " + pets);

        pets.offer(new Pet(99));
        System.out.println("after offer: " + pets);

        pets.add(new Pet(100));

        System.out.println("after add: " + pets);

        pets.addLast(new Pet(101));

        System.out.println("after addLast: " + pets);

    }
}
