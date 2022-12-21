package cci.ch_4_graphs_and_trees;

import cci.ch_2_linked_lists.LinkedNode;

import java.util.LinkedList;
import java.util.Queue;

public class T_4_1_RouteBetweenNodes {

    public static Node[] findRoute(Graph graph, Node fromNode, Node toNode) {
        for (Node n : graph.nodes) {
            n.setState(Node.State.Unvisited);
        }
        Node[] path = null;
        Queue<LinkedNode<Node>> queue = new LinkedList<>();
        queue.offer(new LinkedNode<>(fromNode, null));
        while (!queue.isEmpty()) {
            LinkedNode<Node> bfsNode = queue.poll();
            bfsNode.data.setState(Node.State.Visited);
            if (bfsNode.data == toNode) {
                path = buildRoute(bfsNode);
                break;
            }
            for (Node child : bfsNode.data.getAdjacent()) {
                if (child.getState() != Node.State.Visited) {
                    queue.offer(new LinkedNode<>(child, bfsNode));
                }
            }
        }
        return path;
    }

    private static Node[] buildRoute(LinkedNode<Node> bfsNode) {
        LinkedList<Node> path = new LinkedList<>();
        LinkedNode<Node> currentBfsNode = bfsNode;
        while (currentBfsNode != null) {
            path.addFirst(currentBfsNode.data);
            currentBfsNode = currentBfsNode.next;
        }
        return path.toArray(new Node[0]);
    }

}
