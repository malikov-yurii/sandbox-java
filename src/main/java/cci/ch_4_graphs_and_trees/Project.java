package cci.ch_4_graphs_and_trees;

import java.util.ArrayList;
import java.util.List;

public class Project {

    enum State { BUILT, BUILDING, NOT_BUILT;}

    private final String name;

    private Project.State state;
    private final List<Project> children = new ArrayList<>();
    private final List<Project> dependencies = new ArrayList<>();
    private int dependencyCount;

    public Project(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addDependency(Project project) {
        this.dependencies.add(project);
    }

    public List<Project> getDependencies() {
        return new ArrayList<>(this.dependencies);
    }

    public void addChild(Project project) {
        this.children.add(project);
    }

    public List<Project> getChildren() {
        return new ArrayList<>(this.children);
    }

    public int getDependencyCount() {
        return dependencyCount;
    }

    public void incrementDependencyCount() {
        this.dependencyCount++;
    }

    public void decrementDependencyCount() {
        this.dependencyCount--;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean isReadyForBuild() {
        return this.getState() != State.BUILT
                && this.getDependencies().stream().allMatch(project -> project.state == State.BUILT);
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                '}';
    }

}
