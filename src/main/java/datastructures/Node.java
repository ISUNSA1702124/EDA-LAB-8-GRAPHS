package datastructures;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Node<E> {

    public E data;
    public List<Pair<Integer, E>> neighbors = new ArrayList<>();

    public Node(E data) {
        this.data = data;
    }

    public void addNeighbor(Integer weight, E data) {
        Pair<Integer, E> semiEdge = new Pair<>(weight, data);

        if (!neighbors.contains(semiEdge)) {
            neighbors.add(semiEdge);
        }
    }

    public void addNeighbor(E data) {
        Pair<Integer, E> semiEdge = new Pair<>(1, data);

        if (!neighbors.contains(semiEdge)) {
            neighbors.add(semiEdge);
        }
    }

    @Override
    public String toString() {
        return "[" + data + "] -> " + neighbors + "\n";
    }
}
