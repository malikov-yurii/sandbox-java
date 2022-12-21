package cci.ch_4_graphs_and_trees;

import cci.ch_2_linked_lists.LinkedNode;

import java.util.LinkedList;
import java.util.Queue;

public class T_4_1_RouteBetweenNodes {

    public static GraphNode[] findRoute(Graph graph, GraphNode fromNode, GraphNode toNode) {
        for (GraphNode n : graph.nodes) {
            n.setState(GraphNode.State.Unvisited);
        }
        GraphNode[] path = null;
        Queue<LinkedNode<GraphNode>> queue = new LinkedList<>();
        queue.offer(new LinkedNode<>(fromNode, null));
        while (!queue.isEmpty()) {
            LinkedNode<GraphNode> bfsNode = queue.poll();
            bfsNode.data.setState(GraphNode.State.Visited);
            if (bfsNode.data == toNode) {
                path = buildRoute(bfsNode);
                break;
            }
            for (GraphNode child : bfsNode.data.getAdjacent()) {
                if (child.getState() != GraphNode.State.Visited) {
                    queue.offer(new LinkedNode<>(child, bfsNode));
                }
            }
        }
        return path;
    }

    private static GraphNode[] buildRoute(LinkedNode<GraphNode> bfsNode) {
        LinkedList<GraphNode> path = new LinkedList<>();
        LinkedNode<GraphNode> currentBfsNode = bfsNode;
        while (currentBfsNode != null) {
            path.addFirst(currentBfsNode.data);
            currentBfsNode = currentBfsNode.next;
        }
        return path.toArray(new GraphNode[0]);
    }

}
