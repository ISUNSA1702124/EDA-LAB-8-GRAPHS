package datastructures;

import java.util.ArrayList;
import java.util.List;

public class GraphAlternative<E> {

    public List<NodeAlternative<E>> edges = new ArrayList<>();

    public void addEdge(E begin, E end, Integer weight) {
        NodeAlternative<E> edgeToBeAdded = new NodeAlternative<>(begin, end, weight);

        edges.add(edgeToBeAdded);
    }

    @Override
    public String toString() {
        return edges.toString();
    }
}
