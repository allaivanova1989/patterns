package org.example.chain;

public class SimpleReport extends Notifier {
    public SimpleReport(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Usual report " + message);
    }
}
