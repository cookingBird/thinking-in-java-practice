package com.cookingBird.Forth_ComposeAndExtends;


class Homer {
    char dor(char d){
        System.out.println("dor(char)");
        return 'd';
    }
    float doh(float f){
        System.out.println("doh(float)");
        return 1.0f;
    }
}

class MilHouse {}

class Bart extends Homer{
    void doh(MilHouse m){
        System.out.println("doh(MileHouse)");
    }
}

public class Hide {
    public static void main(String[] args) {
        Bart bart = new Bart();
        bart.doh(1.34f);
        bart.dor('x');
        bart.doh(1);
        bart.doh(new MilHouse());
    }
}
