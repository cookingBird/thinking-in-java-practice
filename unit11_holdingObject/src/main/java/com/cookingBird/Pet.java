package com.cookingBird;

public class Pet {
    private int id;

    public Pet(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + "";
    }
}
