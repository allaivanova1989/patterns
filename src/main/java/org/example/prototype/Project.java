package org.example.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Project implements Copyable {
    private int id;
    private String projectName;
    private String sourceCode;


    @Override
    public Object copy() {
        Project copy = new Project(id, projectName, sourceCode);
        return copy;
    }

}
