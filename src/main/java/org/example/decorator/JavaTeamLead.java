package org.example.decorator;

public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String control() {
        return "Control everybody";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + control();
    }
}
