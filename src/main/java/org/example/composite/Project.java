package org.example.composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstDev = new JavaDev();
        Developer secondDev = new JavaDev();
        Developer pitonDev = new PitonDev();

        team.addDeveloper(firstDev);
        team.addDeveloper(secondDev);
        team.addDeveloper(pitonDev);

        team.createProject();

    }
}
