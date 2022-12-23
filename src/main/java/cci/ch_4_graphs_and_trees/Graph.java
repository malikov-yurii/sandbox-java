package cci.ch_4_graphs_and_trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Graph {

    public Collection<GraphNode> nodes = new ArrayList<>();

    public Graph(Collection<GraphNode> nodes) {
        this.nodes.addAll(nodes);
    }
    public Graph(GraphNode... nodes) {
        this.nodes.addAll(Arrays.asList(nodes));

    }
}
