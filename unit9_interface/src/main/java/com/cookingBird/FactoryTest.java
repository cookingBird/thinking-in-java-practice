package com.cookingBird;

interface Service {
    void method1();

    void method2();
}

interface ServiceFactory {
    Service getService();
}

class ServiceImpl1 implements Service {

    @Override
    public void method1() {
        System.out.println("ServiceImpl1 method1");
    }

    @Override
    public void method2() {
        System.out.println("ServiceImpl1 method2");
    }
}

class ServiceFactoryImpl1 implements ServiceFactory {

    @Override
    public Service getService() {
        return new ServiceImpl1();
    }
}

class ServiceImpl2 implements Service {

    @Override
    public void method1() {
        System.out.println("ServiceImpl2 method1");
    }

    @Override
    public void method2() {
        System.out.println("ServiceImpl2 method2");
    }
}

class ServiceFactoryImpl2 implements ServiceFactory {

    @Override
    public Service getService() {
        return new ServiceImpl2();
    }
}

public class FactoryTest {
    static void consumeService(ServiceFactory serviceFactory) {

        Service service = serviceFactory.getService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        consumeService(new ServiceFactoryImpl1());
        consumeService(new ServiceFactoryImpl2());
    }
}
