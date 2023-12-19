package org.example;

public abstract class AbstractFactory {
    public abstract Cat createCat();

    public abstract Dog createDog();

    public abstract Hamster createHamster();
}

interface Cat {
    public void voice();
}

interface Dog {
    public void bite();
}

interface Hamster {
    public void run();
}

class BarsikCat implements Cat {
    @Override
    public void voice() {
        System.out.println("Мяу");
    }
}

class BobikDog implements Dog {
    @Override
    public void bite() {
        System.out.println("Фас");
    }
}

class HomaHamster implements Hamster {
    @Override
    public void run() {
        System.out.println("Беги");
    }
}




