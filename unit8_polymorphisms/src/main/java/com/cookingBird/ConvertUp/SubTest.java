package com.cookingBird.ConvertUp;

class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;

    }
}

class Super2 {
    public int field = 0;

    protected int getField() {
        return field;
    }

    public int doubleGetField() {
        return getField() * 2;
    }
}

class Sub2 extends Super2 {
    public int field = 1;

    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;

    }

    public int doubleGetField() {
        return getField() * 2;
    }
    public int doubleGetSuperField() {
        return getSuperField() * 2;
    }
    public int doubleGetSuperField2() {
        return super.getField() * 2;
    }
}

public class SubTest {
    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println("Sub.filed:" + sub.field);
        System.out.println("sub.getField()" + sub.getField()); // 1
        System.out.println("sub.getSuperField()" + sub.getSuperField()); // 0
        Super sup = new Sub();
        System.out.println("sup.filed:" + sup.field);
        System.out.println("sup.getField():" + sup.getField()); // 1
        Sub2 sub2 = new Sub2();
        System.out.println("Sub.filed:" + sub2.field);
        System.out.println("sub.getField()" + sub2.getField()); // 1
        System.out.println("sub.getSuperField()" + sub2.getSuperField()); // 0
        System.out.println("sub.doubleGetField()" + sub2.doubleGetField()); // 0
        System.out.println("sub.doubleGetSuperField()" + sub2.doubleGetSuperField()); // 0
        System.out.println("sub.doubleGetSuperField2()" + sub2.doubleGetSuperField2()); // 0
        Super2 sup2 = new Sub2();
        System.out.println("sup.filed:" + sup2.field);
        System.out.println("sup.doubleGetField():" + sup2.doubleGetField()); // 1
    }
}
