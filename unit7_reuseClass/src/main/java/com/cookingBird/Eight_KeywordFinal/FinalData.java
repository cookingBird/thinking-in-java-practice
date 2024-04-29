package com.cookingBird.Eight_KeywordFinal;


import java.util.Random;

class Value {
    int i;

    public Value(int i) {
        this.i = i;
    }
}

public class FinalData {
    private static Random random = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;

    public static final int VALUE_THREE = 39;
    private final int valueFour = random.nextInt(20);
    private Value v1 = new Value(1);
    private final Value v2 = new Value(random.nextInt(20));
    private static final Value VAL_3 = new Value(22);

    private final int[] vals = {1, 2, 3};

    public static void main(String[] args) {
        FinalData finalData = new FinalData("123");
//        finalData.valueOne++;
        finalData.v2.i++;
        finalData.v1 = new Value(9);
        for (int i = 0; i < finalData.vals.length; i++) {
            finalData.vals[i]++;
        }
    }


}

class Test {
    public static void main(String[] args) {
        FinalData finalData = new FinalData("123");
//        finalData.valueOne++; // private access error
//        finalData.v2.i++; // private access error
//        finalData.v1 = new Value(9); // private access error
//        for (int i = 0; i < finalData.vals.length; i++) {
//            finalData.vals[i]++; // private access error
//        }
    }
}
