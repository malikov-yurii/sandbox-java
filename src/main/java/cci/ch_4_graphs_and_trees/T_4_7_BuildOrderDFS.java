package cci.ch_4_graphs_and_trees;

import exception.NoBuildOrderExistsException;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class T_4_7_BuildOrderDFS {

    public static List<String> buildOrder(String[] projects, ProjectDependency[] projectDependencies) {
        List<String> orderedProjects = new LinkedList<>();
        Graph graph = buildGraph(projects, projectDependencies);
        for (GraphNode project : graph.nodes) {
            addToOrdered(project, orderedProjects);
            if (projects.length == orderedProjects.size()) {
                return orderedProjects;
            }
        }
        throw new NoBuildOrderExistsException();
    }

    private static void addToOrdered(GraphNode node, List<String> orderedProjects) {
        if (node.getState() != GraphNode.State.Visited) {
            node.setState(GraphNode.State.Visited);
            for (GraphNode dependency : node.getAdjacent()) {
                addToOrdered(dependency, orderedProjects);
            }
            orderedProjects.add(node.getName());
        }
    }

    private static Graph buildGraph(String[] projects, ProjectDependency[] projectDependencies) {
        Map<String, GraphNode> map = new HashMap<>();
        for (String project : projects) {
            map.put(project, new GraphNode(project));
        }
        for (ProjectDependency projectDependency : projectDependencies) {
            GraphNode dependency = map.get(projectDependency.dependency);
            GraphNode project = map.get(projectDependency.project);
            project.addAdjacent(dependency);
        }
        return new Graph(map.values());
    }

}
