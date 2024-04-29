package com.cookingBird.Forth_ComposeAndExtends;


class Shape {
    public Shape(int i) {
        System.out.println("Shape");
    }

    void dispose() {
        System.out.println("shape dispose");
    }
}

class Circle extends Shape {
    public Circle(int i) {
        super(i);
        System.out.println("Circle");
    }

    @Override
    void dispose() {
        super.dispose();
        System.out.println("Circle dispose");
    }
}

class Triangle extends Shape {
    public Triangle(int i) {
        super(i);
        System.out.println("Triangle");
    }

    @Override
    void dispose() {
        super.dispose();
        System.out.println("Triangle dispose");
    }
}

class Line extends Shape {
    private int start, end;

    public Line(int i, int j) {
        super(i);
        this.start = i;
        this.end = j;
        System.out.println("Line");
    }

    @Override
    void dispose() {
        super.dispose();
        System.out.println("Line dispose");
    }
}


public class CADSystem extends Shape {
    private Circle circle;
    private Triangle triangle;
    private Line[] lines = new Line[3];

    public CADSystem(int i) {
        super(i + 1);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j, j * j);
        }
        circle = new Circle(1);
        triangle = new Triangle(1);
        System.out.println("Combine Constructor");
    }

    @Override
    void dispose() {
        System.out.println("CADSystem dispose");
        circle.dispose();
        triangle.dispose();
        for (Line l : lines) {
            l.dispose();
        }
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem system = new CADSystem(3);
        try {
            // code and exception handling
        }
        finally {
            system.dispose();
        }
    }
}
