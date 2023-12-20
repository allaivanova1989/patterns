package org.example.bridge;

/**
 * Клиентский класс
 */
public class ProgrammCreator {
    public static void main(String[] args) {
        Program[] programms = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new PitonDeveloper())
        };
        for (Program programm : programms) {
            programm.developProgram();
        }
    }

    // В любой момент можем добавить разработчиков или системы или и то, и то
}
