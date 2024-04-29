package com.cookingBird.First_ComposeUse;

public class Bath {
    private String
            s1 = "Happy",
            s2 = "Happy",
            s3,
            s4;
    private Soap castille;
    private int i;
    private float toy;
    static {
        System.out.println("static block");
    }

    public Bath() {
        System.out.println("Bath construct");
        this.s3 = "joy";
        this.toy = 3.14f;
        this.castille = new Soap();
    }
    {
        System.out.println("block");
        i = 47;
    }
    public static void main(String[] args) {
        System.out.println(new Bath());
    }

    @Override
    public String toString() {
        return "Bath{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", castille=" + castille +
                ", i=" + i +
                ", toy=" + toy +
                '}';
    }
}


class Soap {
    private String s;

    public Soap() {
        System.out.println("Soap()");
        this.s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}