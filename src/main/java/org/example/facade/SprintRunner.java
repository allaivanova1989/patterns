package org.example.facade;

/**
 * Клиентский класс
 */
public class SprintRunner {
    public static void main(String[] args) {
//        Job job = new Job();
//        job.doJob();
//        BugTracker bugTracker = new BugTracker();
//        bugTracker.startSprint();
//        Developer developer = new Developer();
//        developer.doJobBeforeDeadline(bugTracker);
//        bugTracker.finishSprint();
//        developer.doJobBeforeDeadline(bugTracker);

        //Чтобы упростить такой код создадим фасад (Workflow) ->

        WorkFlow workFlow = new WorkFlow();
        workFlow.solveProblem();
    }
}
