package com.cookingBird;

interface Destination {
    String readLabel();
}

interface Contents {
    int value();
}

class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }

        @Override
        public String toString() {
            return "PContents";
        }
    }

    protected class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }

        public String readLabel() {
            return label;
        }

        @Override
        public String toString() {
            return "PDestination";
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();

        Contents c = p.contents();
        Destination d = p.destination("Tasmania");


        System.out.println(p.new PContents());
        System.out.println(p.new PDestination("Tasmania"));
    }

}

public class PrivateTest {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();

        Destination d = p.destination("Tasmania");

        // cant access private class
        // p.new PContents();

        // cant access protected class
        // p.new PDestination("Tasmania");
    }
}
