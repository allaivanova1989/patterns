package org.example.adapter;

public class DataBaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToDB();
        dataBase.insert();
        dataBase.update();
        dataBase.select();
        dataBase.remove();
    }
}
