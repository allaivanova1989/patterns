package org.example.prototype;

import lombok.Data;

@Data
public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    Project cloneProject() {
        return (Project) project.copy();
    }
}
