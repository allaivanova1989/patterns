package org.example.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDevJobSite javaDevJobSite = new JavaDevJobSite();
        javaDevJobSite.addVacancy("First position");
        javaDevJobSite.addVacancy("Second position");
        Observer firstSubscriber = new Subscriber("Ihar Ivanou");
        Observer secondSubscriber = new Subscriber("Nik");
        javaDevJobSite.addObserver(firstSubscriber);
        javaDevJobSite.addObserver(secondSubscriber);
        javaDevJobSite.addVacancy("Third position");
        javaDevJobSite.removeVacancy("First position");
    }
}
