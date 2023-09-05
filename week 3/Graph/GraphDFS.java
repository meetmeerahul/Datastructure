import java.util.LinkedList;
import java.util.Stack;

public class GraphDFS {

    private int V; // number of vertices
    private LinkedList<Integer> adj[]; // adjacency list

    // constructor
    public GraphDFS(int v) {
        V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // insert a new edge
    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    // remove an edge
    public void removeEdge(int v, int w) {
        adj[v].remove(Integer.valueOf(w));
        adj[w].remove(Integer.valueOf(v));
    }

    // DFS traversal using stack
    public void DFS(int v) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        visited[v] = true;
        stack.push(v);
        while (!stack.empty()) {
            v = stack.pop();
            System.out.print(v + " ");
            for (int i : adj[v]) {
                if (!visited[i]) {
                    visited[i] = true;
                    stack.push(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphDFS g = new GraphDFS(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.DFS(0); // prints "0 2 3 1"
        g.removeEdge(1, 2);
        System.out.println();
        g.DFS(0); // prints "0 2 3"
    }
}
