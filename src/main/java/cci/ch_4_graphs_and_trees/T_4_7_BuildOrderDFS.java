package cci.ch_4_graphs_and_trees;

import exception.NoBuildOrderExistsException;

import java.util.LinkedList;
import java.util.List;

public class T_4_7_BuildOrderDFS {

    public static List<String> buildOrder(String[] projects, ProjectDependency[] projectDependencies) {
        List<String> orderedProjects = new LinkedList<>();
        ProjectGraph graph = new ProjectGraph(projects, projectDependencies);
        for (Project project : graph.getProjects()) {
            addToOrdered(project, orderedProjects);
            if (projects.length == orderedProjects.size()) {
                return orderedProjects;
            }
        }
        throw new NoBuildOrderExistsException();
    }

    private static void addToOrdered(Project project, List<String> orderedProjects) {
        if (project.getState() == Project.State.BUILDING) {
            throw new NoBuildOrderExistsException();
        }
        if (project.getState() != Project.State.BUILT) {
            project.setState(Project.State.BUILDING);
            for (Project dependency : project.getDependencies()) {
                addToOrdered(dependency, orderedProjects);
            }
            project.setState(Project.State.BUILT);
            orderedProjects.add(project.getName());
        }
    }

}
