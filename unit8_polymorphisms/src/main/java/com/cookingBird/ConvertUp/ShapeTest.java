package com.cookingBird.ConvertUp;

import java.util.Random;

class Shape {
    void draw(){
        System.out.println("Shape drawing");
    }
    void erase(){
        System.out.println("Shape erasing");
    }
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Circle drawing");
    }
    @Override
    void erase(){
        System.out.println("Circle erasing");
    }
}

class Square extends Shape{
    @Override
    void draw() {
        System.out.println("Square drawing");
    }

    @Override
    void erase() {
        System.out.println("Square erasing");
    }
}

class Triangle extends Shape{
    @Override
    void draw() {
        System.out.println("Triangle drawing");
    }

    @Override
    void erase() {
        System.out.println("Triangle erasing");
    }
}

class RandomShapeGenerator{
    private final Random random = new Random(47);
    public Shape next(){
        switch (random.nextInt(3)){
            default:
            case 0:
                    return new Circle();

            case 1:
                    return new Square();

            case 2:
                    return new Triangle();
        }
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        RandomShapeGenerator gen = new RandomShapeGenerator();
        Shape[] shapes = new Shape[50];
        for(int i = 0; i < shapes.length; i++){
            shapes[i] = gen.next();
        }
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
