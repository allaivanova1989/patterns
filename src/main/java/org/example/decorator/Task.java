package org.example.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaDev(new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}
