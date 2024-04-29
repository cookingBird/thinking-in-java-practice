package com.cookingBird.Second_Extends;

class Cleanser {
    private String s = "Cleanser.";

    public void append(String a) {
        this.s += a;
    }

    public void dilute() {
        this.append("dilute()");
    }
    public void apply() {
        this.append("apply()");
    }
    public void scrub() {
        this.append("scrub()");
    }

    @Override
    public String toString() {
        return s+"\n";
    }

    public static void main(String[] args) {
        Cleanser s = new Cleanser();
        s.dilute();
        s.apply();
        s.scrub();
        System.out.println(s);
    }
}

public class Detergent extends Cleanser {

    @Override
    public void scrub(){
        super.append("Detergent.");
        super.scrub();
    }

    public void foam() {
        super.append(" foam()");
    }

    public static void main(String[] args) {
        Detergent s = new Detergent();
        s.dilute();
        s.apply();
        s.scrub();
        s.foam();
        System.out.println(s);
        System.out.println("Testing base class");
        Cleanser.main(args);
    }
}

class Detergent2 extends Detergent{
    @Override
    public void scrub() {
        super.append("Detergent2.scrub()");
    }
    void sterilize(){
        super.append("sterilize()");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Detergent2 x = new Detergent2();
        x.scrub();
        x.sterilize();
        System.out.println(x);
    }
}
