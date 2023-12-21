package org.example.observer;

/**
 * Клиентский класс
 */
public class JobSearch {
    public static void main(String[] args) {
        JavaDevJobSite javaDevJobSite = new JavaDevJobSite();
        javaDevJobSite.addVacancy("First position");
        javaDevJobSite.addVacancy("Second position");
        Observer firstSubscriber = new Subscriber("Ihar Ivanou");
        Observer secondSubscriber = new Subscriber("Nik");
        javaDevJobSite.addObserver(firstSubscriber);
        javaDevJobSite.addObserver(secondSubscriber);

        //Когда добавили третью позицию все подписчики получают уведомление об изменениях.
        javaDevJobSite.addVacancy("Third position");
        //При удалении тоже (при всех изменениях)
        javaDevJobSite.removeVacancy("First position");
    }
}
