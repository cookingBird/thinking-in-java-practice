package com.cookingBird.Five_ChooseComposeBetweenExtends;


class Engine {
    public void start() {
    }

    public void stop() {
    }

    public void accelerate() {
    }

    public void reverse() {
    }

    public void service() {
    }
}

class Wheel {
    public void inflate(int psi) {
    }
}

class Window {
    public void rollup() {
    }

    public void rolldown() {
    }
}

class Door {
    public Window window = new Window();

    public void open() {
    }

    public void close() {
    }
}


public class Car {
    public Engine engine = new Engine();
    public Door left = new Door(),
            right = new Door();
    public Wheel[] wheels = new Wheel[4];

    public Car() {
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.engine.start();
        car.wheels[0].inflate(72);
        car.engine.service();
    }
}
