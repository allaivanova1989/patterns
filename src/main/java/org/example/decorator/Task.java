package org.example.decorator;

/**
 * Клиентский класс
 */
public class Task {
    public static void main(String[] args) {
//        Developer developer = new JavaDeveloper();
//        developer.makeJob();

        //Разработчики могут быть разными и раблту делают по разному. Чтобы не делать реализации от интерфейса Developer - используем декоратор

        Developer developer = new JavaTeamLead(new SeniorJavaDev(new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}
