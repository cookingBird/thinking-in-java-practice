package com.cookingBird;

interface A {
    void play();
}

interface B {
    void play(String foo);
}

interface C {
    void play(int bar);
}

interface D {
    String play();
}

interface E {
    void play();
}

class Impl implements  B, C {
    // error play method not compatible
//class Impl implements A, B, C, D, E {
//    @Override
//    public String play() {
//        return "hello";
//    }

    @Override
    public void play(String foo) {

    }

    @Override
    public void play(int bar) {

    }
}

public class InterfaceConflictTest {
}
