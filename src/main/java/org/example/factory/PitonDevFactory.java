package org.example.factory;

public class PitonDevFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PitonDev();
    }
}
