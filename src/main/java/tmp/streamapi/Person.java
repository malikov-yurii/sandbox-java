package tmp.streamapi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yurii Malikov
 */
class Person {
    private String name;
    private int age;
    private boolean isProgrammer;
    private List<Skill> skills;

    Person(String name, int age, boolean isProgrammer) {
        this.name = name;
        this.age = age;
        this.isProgrammer = isProgrammer;
    }

    Person(String name){
        this.name = name;
        skills = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isProgrammer() {
        return isProgrammer;
    }

    public void setProgrammer(boolean programmer) {
        isProgrammer = programmer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return name;
    }
}