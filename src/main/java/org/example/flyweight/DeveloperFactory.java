package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDevBySpeciality(String speciality) {
        Developer developer = developers.get(speciality);
        if (developer == null) {
            switch (speciality) {
                case "java":
                    System.out.println("Hiring java dev");
                    developer = new JavaDev();
                    break;
                case "piton":
                    System.out.println("Hiring piton dev");
                    developer = new PitonDev();
            }
            developers.put(speciality, developer);
        }
        return developer;
    }
}
