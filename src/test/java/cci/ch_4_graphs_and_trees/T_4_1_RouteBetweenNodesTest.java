package cci.ch_4_graphs_and_trees;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_4_1_RouteBetweenNodesTest {

    @Test
    void findRoute() {
        GraphNode n1 = new GraphNode("1");
        GraphNode n2 = new GraphNode("2");
        GraphNode n3 = new GraphNode("3");
        GraphNode n4 = new GraphNode("4");
        GraphNode n5 = new GraphNode("5");
        GraphNode n6 = new GraphNode("6");
        GraphNode n7 = new GraphNode("7");
        GraphNode n8 = new GraphNode("8");
        GraphNode n9 = new GraphNode("9");

        n1.setAdjacent(n2, n8, n4);
        n4.setAdjacent(n5, n6);
        n5.setAdjacent(n7, n9);

        n7.setAdjacent(n8, n9);
        n3.setAdjacent(n1, n2, n5, n6, n7);
        n6.setAdjacent(n1, n2, n5, n6, n7);

        Graph graph = new Graph(n1, n2, n3, n4, n5, n6, n7, n8, n9);

        assertThat(T_4_1_RouteBetweenNodes.findRoute(graph, n1, n9)).containsExactly(n1, n4, n5, n9);
    }

}