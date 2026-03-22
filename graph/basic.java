import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        int n = 3;

        // adjacency list representation for a graph with n vertices
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // add some edges
        graph.get(0).add(1);
        graph.get(1).add(0);
        graph.get(0).add(2);
        graph.get(2).add(0);

        // print adjacency list
        for (int i = 0; i < graph.size(); i++) {
            System.out.print("Vertex " + i + ": ");
            for (int v : graph.get(i)) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
