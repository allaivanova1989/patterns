package org.example;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new AbstractFactory() {
            @Override
            public Cat createCat() {
                return new BarsikCat();
            }

            @Override
            public Dog createDog() {
                return new BobikDog();
            }

            @Override
            public Hamster createHamster() {
                return new HomaHamster();
            }
        };

        Cat cat = factory.createCat();
        Dog dog = factory.createDog();
        Hamster hamster = factory.createHamster();
        cat.voice();
    }
}