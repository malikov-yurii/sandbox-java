package cci.ch_4_graphs_and_trees;

public class ProjectDependency {
    public final String dependency;
    public final String project;

    public ProjectDependency(String dependency, String project) {
        this.dependency = dependency;
        this.project = project;
    }
}
