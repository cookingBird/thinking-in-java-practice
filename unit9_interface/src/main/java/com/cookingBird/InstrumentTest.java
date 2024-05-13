package com.cookingBird;

class Note {
    @Override
    public String toString() {
        return "Note";
    }
}

abstract class Instrument {
    public abstract void play(Note n);

    public void what() {
        System.out.println("Instrument.what");
    }

    public abstract void adjust();
}

public class InstrumentTest {
}
