package com.cookingBird;

import java.util.*;
import java.util.stream.Collectors;

class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<? extends T> c) {
        super(c);
    }

    public Iterable<T> reversed() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }
                };
            }
        };
    }

    public Iterable<T> randomized() {
        return () -> {
            List<T> list = new ArrayList<>(ReversibleArrayList.this);
            Collections.shuffle(list);
            return list.iterator();
        };
    }
}

public class AdapterMethodIdiom {

    public static void main(String[] args) {
        ReversibleArrayList<Integer> reversibleArrayList = new ReversibleArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int[] ints = {1, 2, 3, 4, 5, 6};
        // error need Collection
//        ReversibleArrayList<Integer> reversibleArrayList2 = new ReversibleArrayList<>(ints);
        for (Integer i : reversibleArrayList) {
            System.out.println(i);
        }
        System.out.println();
        for (Integer i : reversibleArrayList.reversed()) {
            System.out.println(i);
        }
        System.out.println();
        for (Integer i : reversibleArrayList.randomized()) {
            System.out.println(i);
        }
    }
}
