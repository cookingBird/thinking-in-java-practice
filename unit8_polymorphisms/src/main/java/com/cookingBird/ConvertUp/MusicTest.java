package com.cookingBird.ConvertUp;

import java.util.Random;

class Note {
    static final Note MIDDLE_C = new Note();

    @Override
    public String toString() {
        return "Note";
    }
}


class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }

    @Override
    public String toString() {
        return what();
    }
}


class Wind extends Instrument {

    @Override
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    String what() {
        return "Wind";
    }

    void adjust() {
        System.out.println("Adjusting Wind");
    }
}


class Percussion extends Instrument {

    @Override
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    String what() {
        return "Percussion";
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}


class Stringed extends Instrument {

    @Override
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    String what() {
        return "Stringed";
    }

    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind {

    @Override
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    String what() {
        return "Brass";
    }

    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind {

    @Override
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    String what() {
        return "Woodwind";
    }

    void adjust() {
        System.out.println("Adjusting Woodwind");
    }
}

class InstrumentRandomGenerator {
    private final Random random = new Random(11);

    public Instrument next() {
        switch (random.nextInt(5)) {
            default:
            case 0:
                return new Percussion();
            case 1:
                return new Stringed();
            case 2:
                return new Wind();
            case 3:
                return new Brass();
            case 4:
                return new Woodwind();
        }
    }
}

public class MusicTest {

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            System.out.println(i);
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[7];

        InstrumentRandomGenerator generator = new InstrumentRandomGenerator();

        for (int i = 0; i < orchestra.length; i++) {

            orchestra[i] = generator.next();
        }

        for (Instrument i : orchestra) {
            i.adjust();
        }
        tuneAll(orchestra);
    }
}
