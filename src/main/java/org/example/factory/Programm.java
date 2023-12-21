package org.example.factory;

/**
 * Клиентский класс
 */
public class Programm {
    public static void main(String[] args) {
//        Developer javadev = new JavaDev();
//        javadev.writeCode();
//        Developer pitondev = new PitonDev();
//        javadev.writeCode();


        //  Чтобы не создавать в клиенском классе экземпляр разработчика - создадим фабрику.


        DeveloperFactory developerFactory = new JavaDevFactory();
        Developer dev = developerFactory.createDeveloper();
        dev.writeCode();


        //  Теперь достаточно изменить саму фабрику


    }
}
