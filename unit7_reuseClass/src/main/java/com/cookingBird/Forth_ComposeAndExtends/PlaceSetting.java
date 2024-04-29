package com.cookingBird.Forth_ComposeAndExtends;

class Plate {
    public Plate(int i) {
        System.out.println("Plate");
    }
}

class DinnerPlate extends Plate {
    public DinnerPlate(int i) {
        super(i);
        System.out.println("Dinner Plate");
    }
}

class Utensil {
    public Utensil(int i) {
        System.out.println("Utensil");
    }
}

class Fork extends Utensil {
    public Fork(int i) {
        super(i);
        System.out.println("Fork");
    }
}

class Knife extends Utensil {
    public Knife(int i) {
        super(i);
        System.out.println("Knife");
    }
}

class Spoon extends Utensil {
    public Spoon(int i) {
        super(i);
        System.out.println("Spoon");
    }
}

class Custom {
    public Custom(int i) {
        System.out.println("Custom");
    }
}

public class PlaceSetting extends Custom {
    private Spoon spoon;
    private Fork fork;
    private Knife knife;
    private DinnerPlate dinnerPlate;

    public PlaceSetting(int i) {
        super(i + 1);
        spoon = new Spoon(i + 2);
        fork = new Fork(i + 3);
        knife = new Knife(i + 4);
        dinnerPlate = new DinnerPlate(i + 5);
        System.out.println("PlaceSetting");
    }

    public static void main(String[] args) {
        new PlaceSetting(9);
    }
}
