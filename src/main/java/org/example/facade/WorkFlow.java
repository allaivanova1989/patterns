package org.example.facade;

public class WorkFlow {
    // его цель компановка job, bugtracker, dev

    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblem() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
