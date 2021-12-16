package algorithms;

import datastructures.Graph;
import datastructures.GraphAlternative;
import datastructures.Node;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GraphAlgorithms<E> {

    /**
     * This DFS implementation is only for example purposes
     */
    public void innerDFS(Graph<E> G, Node<E> v, List<E> visited) {

        if (visited.contains(v.data)) {
            return;
        } else {

            System.out.print(v.data + " -> ");

            //update visited
            visited.add(v.data);

            for (Pair<Integer, E> n : v.neighbors) {
                //search node in graph
                Node<E> nextNodeToVisit = null;
                for (Node<E> node : G.vertex) {
                    if (node.data == n.getValue()) {
                        nextNodeToVisit = node;
                        break;
                    }
                }

                //recursive call
                innerDFS(G, nextNodeToVisit, visited);
            }
        }
    }

    public List<Integer> DFS(Graph<E> G) {
        //todo implement here!

        //todo remove next line and implement an DFS using stacks
        innerDFS(G, G.vertex.get(0), new ArrayList<>());
        return null;
    }

    public List<Integer> DFS(Map<String, List<Pair<Integer, String>>> G) {
        //todo implement here!
        return null;
    }

    public List<Integer> BFS(Graph<E> G) {
        //todo implement here!
        return null;
    }

    public List<Integer> BFS(Map<E, List<Pair<Integer, E>>> G) {
        //todo implement here!
        return null;
    }

    public Graph<Integer> prim(Graph<E> G) {
        //todo implement here!
        return null;
    }

    public Map<E, List<Pair<Integer, E>>> prim(Map<E, List<Pair<Integer, E>>> G) {
        //todo implement here!
        return null;
    }

    public Graph<Integer> kruskal(GraphAlternative<E> G) {
        //todo implement here!
        return null;
    }

}
