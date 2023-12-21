package org.example.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Developer {
    Command insert;
    Command update;
    Command select;
    Command delete;

    public void insertRecord() {
        insert.execute();
    }

    public void updateRecord() {
        update.execute();
    }

    public void selectRecord() {
        select.execute();
    }

    public void deleteRecord() {
        delete.execute();
    }
}
