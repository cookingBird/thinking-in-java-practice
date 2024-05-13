package com.cookingBird;

interface CanFly {
    void fly();
}

interface CanSwim {
    void swim();
}

interface CanFight {
    void fight();
}

class ActionCharacter {
    public void fight() {
    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
    public void fly() {
    }

    public void swim() {
    }
}

public class HeroTest {
    public static void doFight(CanFight m) {
        m.fight();
    }

    public static void doSwim(CanSwim m) {
        m.swim();
    }

    public static void doFly(CanFly m) {
        m.fly();
    }

    public static void main(String[] args) {

        Hero h = new Hero();
        doFight(h);
        doSwim(h);
        doFly(h);

    }
}
