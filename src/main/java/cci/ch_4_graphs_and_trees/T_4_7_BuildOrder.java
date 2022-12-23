package cci.ch_4_graphs_and_trees;

import exception.NoBuildOrderExistsException;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class T_4_7_BuildOrder {

    public static List<String> buildOrder(String[] projects, ProjectDependency[] projectDependencies) {
        Map<String, GraphNode> graph = new HashMap<>();
        Map<GraphNode, List<GraphNode>> projectDependants = new LinkedHashMap<>();
        for (String project : projects) {
            GraphNode node = new GraphNode(project);
            graph.put(project, node);
            projectDependants.put(node, new LinkedList<>());
        }

        Set<GraphNode> orderedNodes = new LinkedHashSet<>(graph.values());
        for (ProjectDependency projectDependency : projectDependencies) {
            GraphNode dependency = graph.get(projectDependency.dependency);
            GraphNode project = graph.get(projectDependency.project);
            project.addAdjacent(dependency);
            orderedNodes.remove(project);
            projectDependants.get(dependency).add(project);
        }
        Queue<GraphNode> verifyQueue = new LinkedList<>();
        for (GraphNode ordered : orderedNodes) {
            verifyQueue.addAll(projectDependants.get(ordered));
        }
        while (!verifyQueue.isEmpty() && graph.size() >= orderedNodes.size()) {
            GraphNode verifyNode = verifyQueue.poll();
            if (orderedNodes.containsAll(verifyNode.getAdjacent())) {
                orderedNodes.add(verifyNode);
                verifyQueue.addAll(projectDependants.get(verifyNode));
            }
        }
        if (graph.size() != orderedNodes.size()) {
            throw new NoBuildOrderExistsException();
        }
        return orderedNodes.stream().map(GraphNode::getName).collect(Collectors.toList());

    }

}
