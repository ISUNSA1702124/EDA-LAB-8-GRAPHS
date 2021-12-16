package datastructures;

public class NodeAlternative<E> {

    public E begin;
    public E end;
    public int weight;

    public NodeAlternative(E begin, E end, int weight) {
        this.begin = begin;
        this.end = end;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "[" + begin + "] - " + weight + " - [" + end + "]\n";
    }
}
