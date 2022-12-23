package cci.ch_4_graphs_and_trees;

import exception.NoBuildOrderExistsException;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class T_4_7_BuildOrder {

    private final ProjectGraph graph;
    private final List<String> buildOrder;
    private final Queue<Project> verifyQueue;

    private T_4_7_BuildOrder(String[] projects, ProjectDependency[] projectDependencies) {
        graph = new ProjectGraph(projects, projectDependencies);
        buildOrder = new LinkedList<>();
        verifyQueue = new LinkedList<>();
    }

    public static List<String> buildOrder(String[] projects, ProjectDependency[] projectDependencies) {
        return new T_4_7_BuildOrder(projects, projectDependencies).build();
    }

    private List<String> build() {
        for (Project project : graph.getProjects()) {
            checkReadyForBuild(project);
        }
        if (buildOrder.isEmpty()) {
            throw new NoBuildOrderExistsException();
        }
        while (!verifyQueue.isEmpty() && graph.getProjects().size() > buildOrder.size()) {
            Project project = verifyQueue.poll();
            checkReadyForBuild(project);
        }
        if (graph.getProjects().size() != buildOrder.size()) {
            throw new NoBuildOrderExistsException();
        }
        return buildOrder;
    }

    private void checkReadyForBuild(Project project) {
        if (project.isReadyForBuild()) {
            buildOrder.add(project.getName());
            project.setState(Project.State.BUILT);
            verifyQueue.addAll(project.getChildren());
        }
    }

}
