package com.cookingBird;

class Parcell {
    class Contents{
        private int i = 11;

        public int value(){
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }

        String readLabel(){
            return label;
        }
    }

    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }
}

public class ParcellTest {

    public static void main(String[] args) {

        Parcell p = new Parcell();
        p.ship("Tasmania");
        //内部类可以访问外部类的成员
        Parcell.Contents c = p.new Contents();
        Parcell.Destination d = p.new Destination("Borneo");
        System.out.println("hello world");
    }
}
