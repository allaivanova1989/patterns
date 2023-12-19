package org.example.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class JavaDev implements Collection {
    private String name;
    private String[] skills;

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < skills.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
