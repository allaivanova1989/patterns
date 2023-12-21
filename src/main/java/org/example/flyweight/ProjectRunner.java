package org.example.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Клиентский класс. Ему надо использовать много разработчиков много раз
 */
public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();
        developers.add(developerFactory.getDevBySpeciality("java"));
        developers.add(developerFactory.getDevBySpeciality("java"));
        developers.add(developerFactory.getDevBySpeciality("java"));
        developers.add(developerFactory.getDevBySpeciality("piton"));
        developers.add(developerFactory.getDevBySpeciality("piton"));
        developers.add(developerFactory.getDevBySpeciality("piton"));
        developers.add(developerFactory.getDevBySpeciality("piton"));

        for (Developer dev : developers) {
            dev.writeCode();
        }
    }
}
