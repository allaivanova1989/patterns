package org.example.factory;

public class JavaDevFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDev();
    }
}
