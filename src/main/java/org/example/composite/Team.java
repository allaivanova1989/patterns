package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer dev) {
        developers.add(dev);
    }

    public void createProject() {
        System.out.println("Create project");
        for (Developer dev : developers) {
            dev.writCode();
        }
    }
}
