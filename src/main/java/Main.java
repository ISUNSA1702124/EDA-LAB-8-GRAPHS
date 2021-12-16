import algorithms.GraphAlgorithms;
import datastructures.Graph;
import datastructures.GraphAlternative;
import datastructures.Node;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Example 1: Creating simple vertex of integer
        Node<Integer> vertex = new Node<>(1);
        vertex.addNeighbor(1, 4);
        vertex.addNeighbor(3, 10);

        System.out.println(vertex);

        //Example 1: Creating simple vertex of strings
        Node<String> vertex2 = new Node<>("A");
        vertex2.addNeighbor(1, "B");
        vertex2.addNeighbor(2, "C");

        System.out.println(vertex2);

        //Example 3: Creating graph of cities
        Graph<String> cities = new Graph<>();
        cities.link("Lima", "Arequipa", 20);
        cities.link("Lima", "Trujillo", 40);
        cities.link("Trujillo", "Arequipa", 30);
        cities.link("Arequipa", "Tacna", 10);

        System.out.println(cities);

        //Example 4: Creating graph of cities, representation with hashmap
        Map<String, List<Pair<Integer, String>>> cities2 = new HashMap<>();

        cities2.put("Lima", new ArrayList<>());
        cities2.get("Lima").add(new Pair<>(20, "Arequipa"));
        cities2.get("Lima").add(new Pair<>(40, "Trujillo"));

        cities2.put("Arequipa", new ArrayList<>());
        cities2.get("Arequipa").add(new Pair<>(20, "Lima"));
        cities2.get("Arequipa").add(new Pair<>(30, "Trujillo"));
        cities2.get("Arequipa").add(new Pair<>(10, "Tacna"));

        cities2.put("Trujillo", new ArrayList<>());
        cities2.get("Trujillo").add(new Pair<>(40, "Lima"));
        cities2.get("Trujillo").add(new Pair<>(30, "Arequipa"));

        cities2.put("Tacna", new ArrayList<>());
        cities2.get("Tacna").add(new Pair<>(10, "Arequipa"));

        System.out.println(cities2);

        //Example 5: Creating graph of cities, edge representation
        GraphAlternative<String> cities3 = new GraphAlternative<>();
        cities3.addEdge("Lima", "Arequipa", 20);
        cities3.addEdge("Lima", "Trujillo", 40);
        cities3.addEdge("Trujillo", "Arequipa", 30);
        cities3.addEdge("Arequipa", "Tacna", 10);

        System.out.println(cities3);

        //Example 6: Dummy DFS
        GraphAlgorithms<String> algo = new GraphAlgorithms<>();
        algo.DFS(cities);

    }
}