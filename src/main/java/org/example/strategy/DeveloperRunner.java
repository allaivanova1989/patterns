package org.example.strategy;

/**
 * Клиентский класс
 */
public class DeveloperRunner {
    public static void main(String[] args) {
        DevStrategy dev = new DevStrategy();
        dev.setActivity(new Sleeping());
        dev.executeActivity();

        dev.setActivity(new Reading());
        dev.executeActivity();

        dev.setActivity(new Training());
        dev.executeActivity();

        dev.setActivity(new Coding());
        dev.executeActivity();
    }


    // Похож на шаблон State. Но в State  управление сменой активностей в классе DevState.
    // А в шаблоне Strategy это делается в клиентском классе

}
