package org.example.adapter;

public class AdapterJavaToDB extends JavaApp implements DataBase {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
// В каждом методе интерфейса вызываем метод нашего приложения