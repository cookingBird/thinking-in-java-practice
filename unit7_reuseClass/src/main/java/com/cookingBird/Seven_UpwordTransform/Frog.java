package com.cookingBird.Seven_UpwordTransform;


class Amphibian {
    public void swim() {
        System.out.println("Amphibian swim");
    }

    public void move() {
        System.out.println("Amphibian move");
    }
}

public class Frog extends Amphibian {
    public void guag() {
        System.out.println("Frog guag");
    }

    @Override
    public void move() {
        System.out.println("Frog move");
    }

    public static void main(String[] args) {
        Amphibian a = new Frog();
        a.swim();
        a.move();
        //a.guag();
        //a.eat();
    }
}
