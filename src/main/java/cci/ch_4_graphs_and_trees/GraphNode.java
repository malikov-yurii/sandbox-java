package cci.ch_4_graphs_and_trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GraphNode {

    enum State { Unvisited, Visiting, Visited}

    private final String name;
    private State state;
    private final List<GraphNode> adjacent = new ArrayList<>();

    public GraphNode(String name, GraphNode... adjacent) {
        this.name = name;
        this.adjacent.addAll(Arrays.asList(adjacent));
    }

    public String getName() {
        return name;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void addAdjacent(GraphNode graphNode) {
        this.adjacent.add(graphNode);
    }

    public void setAdjacent(GraphNode... adjacent) {
        this.adjacent.clear();
        this.adjacent.addAll(Arrays.asList(adjacent));
    }

    public List<GraphNode> getAdjacent() {
        return Collections.unmodifiableList(adjacent);
    }

    @Override
    public String toString() {
        return "N[" + name + "-" + state + "]";
    }

}
