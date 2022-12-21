package cci.ch_4_graphs_and_trees;

import java.util.LinkedList;
import java.util.Queue;

public class T_4_1_VerifyRouteBetweenNodesExists {

    public static boolean verifyRouteExists(Graph graph, Node fromNode, Node toNode) {
        for (Node node : graph.nodes) {
            node.setState(Node.State.Unvisited);
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(fromNode);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            node.setState(Node.State.Visited);
            if (node == toNode) {
                return true;
            }
            for (Node adjNode : node.getAdjacent()) {
                if (adjNode.getState() != Node.State.Visited) {
                    queue.offer(adjNode);
                }
            }
        }
        return false;
    }

}
