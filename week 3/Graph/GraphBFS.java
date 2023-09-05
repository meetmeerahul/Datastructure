import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {
    private int V; // Number of vertices
    private LinkedList<Integer> adjList[];

    public GraphBFS(int v) {
        V = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    public void addEdge(int u, int v) {
        adjList[u].add(v);
    }

    // Remove an edge from the graph
    public void removeEdge(int u, int v) {
        adjList[u].remove(Integer.valueOf(v));
    }

    // Breadth First Search (BFS) Traversal
    public void BFS(int start) {
        boolean visited[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int adj : adjList[vertex]) {
                if (!visited[adj]) {
                    visited[adj] = true;
                    queue.add(adj);
                }
            }
        }
    }

    public static void main(String[] args) {

        GraphBFS g = new GraphBFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("BFS Traversal:");
        g.BFS(2);

        System.out.println();

        g.removeEdge(2, 3);
        
        g.BFS(2);

    }

}
