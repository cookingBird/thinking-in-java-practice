package com.cookingBird.ConvertUp;

class StaticSuper{
    public static void staticGet(){
        System.out.println("base static get");
    }
    public void dynamicGet(){
        System.out.println("base dynamic get");
    }
}

class StaticSub extends StaticSuper{
    public static void staticGet(){
        System.out.println("derived static get");
    }
    @Override
    public void dynamicGet(){
        System.out.println("derived dynamic get");
    }
}

public class StaticTest {
    public static void main(String[] args) {

        StaticSuper sup = new StaticSub();
        sup.staticGet();
        sup.dynamicGet();
    }
}
