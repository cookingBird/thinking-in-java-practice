package com.cookingBird.ConvertUp;

import java.util.Random;

class Animal {
    void what(){
        System.out.println("Animal");
    }
}

class Rodent extends Animal {
    @Override
    void what() {
        System.out.println("Rodent");
    }
}

class Mouse extends Rodent {
    @Override
    void what() {
        System.out.println("Mouse");
    }
}

class GuineaPig extends Rodent {
    @Override
    void what() {
        System.out.println("Guinea Pig");
    }
}

class Hamster extends Rodent {
    @Override
    void what() {
        System.out.println("Hamster");
    }
}

class AnimalGenerator {
    private final Random random = new Random(11);

    public Rodent next(){
        switch (random.nextInt(5)){
            default:

            case 0:
                return new Mouse();

            case 1:
                return new GuineaPig();

            case 2:
                return new Hamster();

            case 3:

                return new Rodent();
        }
    }
}

public class AnimalsTest {
    public static void main(String[] args) {

        AnimalGenerator generator = new AnimalGenerator();
        for (int i = 0; i < 10; i++){
            Animal a = generator.next();
            a.what();
        }
    }
}
