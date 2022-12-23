package cci.ch_4_graphs_and_trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectGraph {

    private final List<Project> projects = new ArrayList<>();
    private final Map<String, Project> map = new HashMap<>();

    public ProjectGraph(String[] projects, ProjectDependency[] projectDependencies) {
        this.addProjects(projects);
        this.addEdges(projectDependencies);
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void addProject(String name) {
        if (!map.containsKey(name)) {
            Project project = new Project(name);
            this.projects.add(project);
            this.map.put(name, project);
        }
    }

    public void addEdge(String dependency, String project) {
        Project parent = map.get(dependency);
        Project child = map.get(project);
        parent.addChild(child);
        child.addDependency(parent);
    }

    public void addProjects(String[] projects) {
        for (String project : projects) {
            this.addProject(project);
        }
    }

    public void addEdges(ProjectDependency[] projectDependencies) {
        for (ProjectDependency projectDependency : projectDependencies) {
            this.addEdge(projectDependency.dependency, projectDependency.project);
        }
    }
}
