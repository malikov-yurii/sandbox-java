package cci.ch_4_graphs_and_trees;

import java.util.LinkedList;
import java.util.Queue;

public class T_4_1_VerifyRouteBetweenNodesExists {

    public static boolean verifyRouteExists(Graph graph, GraphNode fromNode, GraphNode toNode) {
        for (GraphNode node : graph.nodes) {
            node.setState(GraphNode.State.Unvisited);
        }
        Queue<GraphNode> queue = new LinkedList<>();
        queue.offer(fromNode);
        while (!queue.isEmpty()) {
            GraphNode node = queue.poll();
            node.setState(GraphNode.State.Visited);
            if (node == toNode) {
                return true;
            }
            for (GraphNode adjNode : node.getAdjacent()) {
                if (adjNode.getState() != GraphNode.State.Visited) {
                    queue.offer(adjNode);
                }
            }
        }
        return false;
    }

}
