package org.example.decorator;

public class SeniorJavaDev extends DeveloperDecorator {
    public SeniorJavaDev(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Review code";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
