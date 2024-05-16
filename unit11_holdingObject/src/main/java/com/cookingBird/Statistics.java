package com.cookingBird;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Statistics {
    public static void main(String[] args) {
        Random random = new Random(37);
        Map<Integer,Integer> m = new HashMap<>();

        for (int i = 0; i < 20_000; i++){
            int value = random.nextInt(20);
            Integer pre = m.get(value);
            m.put(value, pre == null ? 1 : pre + 1);
        }
        System.out.println(m);

        for (Iterator<Map.Entry<Integer,Integer>> it = m.entrySet().iterator(); it.hasNext();){
            Map.Entry<Integer,Integer> entry = it.next();
            if (entry.getValue() < 1000){
                it.remove();
            }
        }
        System.out.println(m);
    }
}

class IteratorTest implements Iterator<String> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }
}
