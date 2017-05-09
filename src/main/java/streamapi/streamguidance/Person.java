package streamapi.streamguidance;

/**
 * @author Yurii Malikov
 */
class Person {
    private String name;
    private int age;
    private boolean isProgrammer;

    Person(String name, int age, boolean isProgrammer) {
        this.name = name;
        this.age = age;
        this.isProgrammer = isProgrammer;
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

    @Override
    public String toString() {
        return name;
    }
}