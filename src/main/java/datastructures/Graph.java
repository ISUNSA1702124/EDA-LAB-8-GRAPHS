package datastructures;

import java.util.ArrayList;
import java.util.List;

public class Graph<E> {

    public List<Node<E>> vertex = new ArrayList<>();

    public void link(E begin, E end, Integer weight) {

        boolean createVertexBegin = true;
        boolean createVertexEnd = true;

        //search if vertex begin exists
        for (Node<E> v : vertex) {
            if (v.data == begin) {
                v.addNeighbor(weight, end);
                createVertexBegin = false;
            }

            if (v.data == end) {
                v.addNeighbor(weight, begin);
                createVertexEnd = false;
            }
        }

        if (createVertexBegin) {
            Node<E> a = new Node<>(begin);
            a.addNeighbor(weight, end);
            vertex.add(a);
        }

        if (createVertexEnd) {
            Node<E> b = new Node<>(end);
            b.addNeighbor(weight, begin);
            vertex.add(b);
        }

    }

    @Override
    public String toString() {
        return vertex.toString();
    }
}
