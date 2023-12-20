package org.example.visitor;

/**
 * Клиентский класс
 */
public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();
        System.out.println("Junior is working");
        project.beWritten(junior);

        System.out.println("Senior is working");
        project.beWritten(senior);
    }
}
