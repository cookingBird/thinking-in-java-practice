package com.cookingBird.Seven_UpwordTransform;


class Instrument {
    public void play() {
        System.out.println("Instrument.play()");
    }

    static void tune(Instrument i) {
        i.play();
    }
}

public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute); // Upcasting
    }
}

class Percussion extends Instrument {
}

class Stringed extends Instrument {
}

class Brass extends Instrument {
}

class Woodwind extends Instrument {
}
