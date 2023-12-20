package org.example.visitor;

public class ProjectClass implements ProjectElement {
    @Override
    public void beWritten(Developer dev) {
        dev.create(this);
    }
}
