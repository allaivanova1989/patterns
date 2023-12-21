package org.example.adapter;

/**
 * Клиентский класс
 */
public class DataBaseRunner {
    public static void main(String[] args) {

        //Изначально мы никак не могли использовать вместе java приложение и базу данных. Но благодаря адаптеру теперь можем
        DataBase dataBase = new AdapterJavaToDB();
        dataBase.insert();
        dataBase.update();
        dataBase.select();
        dataBase.remove();
    }
}
