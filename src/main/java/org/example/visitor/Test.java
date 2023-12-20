package org.example.visitor;

public class Test implements ProjectElement {
    @Override
    public void beWritten(Developer dev) {
        dev.create(this);
    }
}
