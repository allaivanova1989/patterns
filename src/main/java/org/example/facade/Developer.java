package org.example.facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is working");
        } else {
            System.out.println("Developer is waiting");
        }

    }
}
