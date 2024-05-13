package com.cookingBird;


interface Nesting {
    void method1();

    void method2();

    void method3();

    interface Nesting1 {
        void method1();
    }

    interface Nesting2 {
        void method2();
    }

//    interface Nesting3 {
//        void method2();
//
//        void method3();
//    }
    interface Nesting23 {
        void method2();

        void method3();
    }
}

class ImplementsA implements Nesting {
    @Override
    public void method1() {
        System.out.println("ImplementsA method1");
    }

    @Override
    public void method2() {
        System.out.println("ImplementsA method2");
    }

    @Override
    public void method3() {
        System.out.println("ImplementsA method3");
    }


    public void method4(){
        System.out.println("ImplementsA method4");
    }

    public Nesting1 getA1() {
        return new Nesting1() {
            @Override
            public void method1() {
                System.out.println("method1");
            }
        };
    }
    static class Nesting2Impl implements Nesting.Nesting2 {
        final ImplementsA implementsA;

        public Nesting2Impl(ImplementsA implementsA) {
            this.implementsA = implementsA;
        }

        @Override
        public void method2() {
            implementsA.method2();
        }
    }

    public Nesting2 getA2() {
        return new Nesting2Impl(this) {
            @Override
            public void method2() {
                this.implementsA.method2();
            }
        };
    }

    public Nesting2 getA22() {
        return new Nesting2() {
            @Override
            public void method2() {
                ImplementsA.this.method2();
            }
        };
    }

    public Nesting2 getA222() {
        return this::method2;
    }

    public Nesting23 getA3() {
        return new Nesting23() {
            @Override
            public void method2() {
                method4();
            }

            @Override
            public void method3() {
                ImplementsA.this.method3();
            }
        };
    }
}

public class NestingInterfaceTest {
    public static void main(String[] args) {

        ImplementsA implementsA = new ImplementsA();
        Nesting.Nesting1 nesting1 = implementsA.getA1();
        nesting1.method1();

        Nesting.Nesting2 nesting2 = implementsA.getA2();
        nesting2.method2();

        Nesting.Nesting2 nesting22 = implementsA.getA22();
        nesting22.method2();

        Nesting.Nesting2 nesting222 = implementsA.getA222();
        nesting222.method2();

        Nesting.Nesting23 nesting3 = implementsA.getA3();
        nesting3.method2();
        nesting3.method3();
    }
}
