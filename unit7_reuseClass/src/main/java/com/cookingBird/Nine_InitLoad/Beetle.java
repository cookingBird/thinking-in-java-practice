package com.cookingBird.Nine_InitLoad;

class Insect {
    private int i = 9;
    protected int j;
    public static int y = printInt("static Insect.y initialized");

    Insect() {
        System.out.println("Insect()" + "i=" + i + "j=" + j);
        j = 55;
    }

    static {
        System.out.println("static Insect block initialized");
    }

    public static int printInt(String s) {
        System.out.println(s);
        return 47;
    }
}


public class Beetle extends Insect {
    static int x2 = printInt("static Beetle.x2 initialized");
    private int k = printInt("Beetle.k initialized");

    public Beetle() {
        System.out.println("k=" + k + " j=" + j);
    }


    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
//        Beetle b2 = new Beetle(); // static be load only once
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println("Test constructor");
        System.out.println(Insect.y);
//        System.out.println(Beetle.x2);
    }
}


