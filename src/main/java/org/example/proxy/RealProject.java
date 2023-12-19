package org.example.proxy;

public class RealProject implements Project {
    private String urlOnGit;

    public RealProject(String urlOnGit) {
        this.urlOnGit = urlOnGit;
        loadProjectFromGit();
    }

    public void loadProjectFromGit() {
        System.out.println("Loadding project from github   " + urlOnGit);
    }

    @Override
    public void run() {
        System.out.println("Running project " + urlOnGit);
    }
}
