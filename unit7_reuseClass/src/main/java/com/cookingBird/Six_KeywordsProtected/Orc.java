package com.cookingBird.Six_KeywordsProtected;

class Villain {
    private String name;

    protected void setName(String name) {
        this.name = name;
    }

    public Villain(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Villain{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Orc extends Villain {
    private int ocrNumber;

    public Orc(String name, int ocrNumber) {
        super(name);
        this.ocrNumber = ocrNumber;
    }

    public void change(String name, int ocrNumber) {
        super.setName(name);
        this.ocrNumber = ocrNumber;
    }

    @Override
    public String toString() {
        return "ocrNumber" + ocrNumber + ":" + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Stan", 123456789);
        System.out.println(orc);
        orc.change("Bob", 987654321);
        System.out.println(orc);
        //orc.setName("Bob"); // error
    }
}
