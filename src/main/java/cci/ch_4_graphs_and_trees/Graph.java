package cci.ch_4_graphs_and_trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Graph {

    private List<GraphNode> nodes = new ArrayList<>();

    public Graph(Collection<GraphNode> nodes) {
        this.nodes.addAll(nodes);
    }
    public Graph(GraphNode... nodes) {
        this.nodes.addAll(Arrays.asList(nodes));
    }

    public List<GraphNode> getNodes() {
        return nodes;
    }

}
