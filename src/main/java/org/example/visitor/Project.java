package org.example.visitor;

public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new DataBase(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer dev) {
        for (ProjectElement projectElement : projectElements) {
            projectElement.beWritten(dev);
        }
    }
}
