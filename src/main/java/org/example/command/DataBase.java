package org.example.command;

public class DataBase {
    public void insert() {
        System.out.println("Inserting record  ");
    }

    public void update() {
        System.out.println("Updating record  ");
    }

    public void select() {
        System.out.println("Selecting record  ");
    }

    public void delete() {
        System.out.println("Deleting record  ");
    }

    // Используем шаблон Команда, чтобы создать отдельные классы для каждого из этих запросов
}
