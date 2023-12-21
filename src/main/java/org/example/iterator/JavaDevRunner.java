package org.example.iterator;

/**
 * Клиентский класс
 */
public class JavaDevRunner {
    public static void main(String[] args) {
        String[] skills = {"java", "allure", "springBoot"};
        JavaDev javaDev = new JavaDev("Alex", skills);
        Iterator iterator = javaDev.getIterator();
        System.out.println("Dev " + javaDev.getName() + " has skills ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
