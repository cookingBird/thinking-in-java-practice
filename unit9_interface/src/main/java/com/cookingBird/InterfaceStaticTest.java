package com.cookingBird;

interface Month {
    int JANUARY = 1,
            FEBRUARY = 2,
            MARCH = 3,
            APRIL = 4,
            MAY = 5,
            JUNE = 6,
            JULY = 7,
            AUGUST = 8,
            SEPTEMBER = 9,
            OCTOBER = 10,
            NOVEMBER = 11,
            DECEMBER = 12;
}

public class InterfaceStaticTest implements Month {
    public static void main(String[] args) {
        InterfaceConflictTest test = new InterfaceConflictTest();
        System.out.println(Month.JANUARY);
        // error field is final
//        Month.JANUARY = 2;
    }
}
