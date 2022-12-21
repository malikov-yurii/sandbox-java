package cci.ch_4_graphs_and_trees;

public class GraphNode {

    enum State { Unvisited, Visiting, Visited}

    private final String name;
    private GraphNode[] adjacent;
    private State state;

    public GraphNode(String name, GraphNode... adjacent) {
        this.name = name;
        this.adjacent = adjacent;
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

    public void setAdjacent(GraphNode... adjacent) {
        this.adjacent = adjacent;
    }

    public GraphNode[] getAdjacent() {
        return adjacent == null ? new GraphNode[]{} : adjacent;
    }

    @Override
    public String toString() {
        return "N[" + name + "-" + state + "]";
    }

}
