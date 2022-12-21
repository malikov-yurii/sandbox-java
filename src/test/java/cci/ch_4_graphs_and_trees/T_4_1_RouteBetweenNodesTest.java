package cci.ch_4_graphs_and_trees;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_4_1_RouteBetweenNodesTest {

    @Test
    void findRoute() {
        Node n1 = new Node("1");
        Node n2 = new Node("2");
        Node n3 = new Node("3");
        Node n4 = new Node("4");
        Node n5 = new Node("5");
        Node n6 = new Node("6");
        Node n7 = new Node("7");
        Node n8 = new Node("8");
        Node n9 = new Node("9");

        n1.setAdjacent(n2, n8, n4);
        n4.setAdjacent(n5, n6);
        n5.setAdjacent(n7, n9);

        n7.setAdjacent(n8, n9);
        n3.setAdjacent(n1, n2, n5, n6, n7);
        n6.setAdjacent(n1, n2, n5, n6, n7);

        Graph graph = new Graph();
        graph.nodes = new Node[]{n1, n2, n3, n4, n5, n6, n7, n8, n9};

        assertThat(T_4_1_RouteBetweenNodes.findRoute(graph, n1, n9)).containsExactly(n1, n4, n5, n9);
    }

}