package com.cookingBird.First_ComposeUse;

class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("waterSource()");
        s = "constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

class SprinklerSystem {
    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
    }
    private String value1, value2, value3, value4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return "SprinklerSystem{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                ", value4='" + value4 + '\'' +
                ", source=" + source +
                ", i=" + i +
                ", f=" + f +
                '}';
    }
}