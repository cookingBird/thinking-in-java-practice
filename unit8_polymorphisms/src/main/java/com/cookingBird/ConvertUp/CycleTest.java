package com.cookingBird.ConvertUp;

class Cycle {
    void ride(){
        System.out.println("cycle ride");
        wheels();
    }
    void wheels(){
        System.out.println("cycle has 2 wheels");
    }
}

class Unicycle extends Cycle{
    @Override
    void ride() {
        System.out.println("Unicycle.ride()");
        wheels();
    }

    @Override
    void wheels() {
        System.out.println("Unicycle has 1 wheel");
    }
}

class Tricycle extends Cycle{
    @Override
    void ride() {
        System.out.println("Tricycle.ride()");
        wheels();
    }

    @Override
    void wheels() {
        System.out.println("Tricycle has 3 wheels");
    }
}

public class CycleTest {

    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        Cycle unicycle = new Unicycle();
        Cycle tricycle = new Tricycle();

        rideCycle(cycle);

        rideCycle(unicycle);

        rideCycle(tricycle);

    }
    static  void rideCycle(Cycle cycle){
        cycle.ride();
    }
}