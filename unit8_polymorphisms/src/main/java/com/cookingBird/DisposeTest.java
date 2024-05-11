package com.cookingBird;

class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        System.out.println("Characteristic created " + s);
    }

    protected void dispose() {
        System.out.println("dispose Characteristic" + s);
    }
}

class Description {
    private String s;

    Description(String s) {
        this.s = s;
        System.out.println("Description created " + s);
    }

    protected void dispose() {
        System.out.println("dispose Characteristic" + s);
    }
}

class LivingCreature {
    protected Characteristic p = new Characteristic("is alive");
    protected Description t = new Description("Basic Living Creature");

    LivingCreature() {
        System.out.println("Living Creature");
    }

    protected void dispose() {
        System.out.println("Living Creature dispose");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature {
    protected Characteristic p = new Characteristic("has heart");
    protected Description t = new Description("Animal not vegetable");

    Animal() {
        System.out.println("Animal");
    }

    protected void dispose() {
        System.out.println("Animal dispose");
        p.dispose();
        t.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal {
    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("Both water and land");

    Amphibian() {
        System.out.println("Amphibian");
    }

    protected void dispose() {
        System.out.println("Amphibian dispose");
        p.dispose();
        t.dispose();
        super.dispose();
    }
}

class Frog extends Amphibian {
    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats bugs");

    public Frog() {

        System.out.println("Frog");
    }

    protected void dispose() {

        System.out.println("Frog dispose");
        p.dispose();
        t.dispose();
        super.dispose();
    }

    public static void main(String[] args) {

        Amphibian obj = new Frog();
        System.out.println("Bye !");
        obj.dispose();
    }
}

class Shared {
    private int refCount = 0;
    private static long counter = 1;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating Shared instance " + id);
    }

    public void addRef() {
        refCount++;
    }

    protected void dispose() {
        refCount--;
        if (refCount == 0) {
            System.out.println("Disposing Shared " + id);
        }
    }
}

class Composing {
    private Shared shared;

    public Composing(Shared shared) {
        System.out.println("Creating Composing " + shared);
        this.shared = shared;
        shared.addRef();
    }

    protected void dispose() {
        System.out.println("Disposing Composing");
        shared.dispose();
    }
}


public class DisposeTest {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
        };

        for (Composing c : composings) {
            c.dispose();
        }
    }

}
