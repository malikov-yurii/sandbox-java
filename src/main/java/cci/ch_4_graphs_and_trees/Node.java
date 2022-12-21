package cci.ch_4_graphs_and_trees;

public class Node {

    enum State { Unvisited, Visiting, Visited}

    private final String name;
    private Node[] adjacent;
    private State state;

    public Node(String name, Node... adjacent) {
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

    public void setAdjacent(Node... adjacent) {
        this.adjacent = adjacent;
    }

    public Node[] getAdjacent() {
        return adjacent == null ? new Node[]{} : adjacent;
    }

    @Override
    public String toString() {
        return "N[" + name + "-" + state + "]";
    }

}
