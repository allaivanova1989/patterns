package org.example.proxy;

public class ProxyProject implements Project {

    private String urlOnGit;
    private RealProject realProject;

    public ProxyProject(String urlOnGit) {
        this.urlOnGit = urlOnGit;
    }

    @Override
    public void run() {
        if (realProject == null) {
            realProject = new RealProject(urlOnGit);
        }
        realProject.run();
    }
}
