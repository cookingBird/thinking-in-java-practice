package com.cookingBird;

import java.util.*;

public class PriorityQueueDemo {
    static final Random random = new Random(37);
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextInt(i+ 10));
        }
        System.out.println(priorityQueue);

        List<Integer> ints = Arrays.asList(25,33,12,10,42,23,55,1,3,5,4,6,8,7,9);
        priorityQueue = new PriorityQueue<>(ints);
        System.out.println(priorityQueue);
        priorityQueue = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);

        String fact = "education should eschew obfuscation";
        List<String> strings = Arrays.asList(fact.split(" "));
        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>(strings);
        System.out.println(stringPriorityQueue);

        stringPriorityQueue = new PriorityQueue<>(strings.size(), Collections.reverseOrder());

        stringPriorityQueue.addAll(strings);

        System.out.println(stringPriorityQueue);

        Set<Character> characters = new HashSet<>();
        for (char c : fact.toCharArray()) {

            characters.add(c);
        }
        PriorityQueue<Character> characterPriorityQueue = new PriorityQueue<>(characters);
        System.out.println(characterPriorityQueue);
    }
}
