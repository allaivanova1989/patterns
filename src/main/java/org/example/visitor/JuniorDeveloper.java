package org.example.visitor;

public class JuniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing class as junior...");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Writing dataBase as junior...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Writing test as junior...");
    }
}
