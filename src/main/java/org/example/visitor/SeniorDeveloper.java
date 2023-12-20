package org.example.visitor;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing class as senior...");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Writing dataBase as senior...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Writing test as senior...");
    }
}
