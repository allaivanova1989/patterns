package org.example.memento;

/**
 * Клиентский класс
 */
public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GitHubRepo repo = new GitHubRepo();

        System.out.println("new project/ Version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current project to git");
        repo.setSave(project.save());

        System.out.println("Update project ");
        project.setVersionAndDate("Version 1.5");
        System.out.println(project);

        System.out.println("Something went wrong");
        System.out.println("Rolling back to first version");
        project.load(repo.getSave());
        System.out.println(project);
    }

}
