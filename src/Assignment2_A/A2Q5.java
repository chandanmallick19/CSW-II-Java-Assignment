/*
Write a java program to traverse a graph using breadth first search (use
ArrayDeque collection ).
 */

package Assignment2_A;
import java.util.*;

public class A2Q5 {

    private static class Graph {

        private int V;
        private ArrayList<Integer>[] adj;

        public Graph(int V) {
            this.V = V;
            adj = new ArrayList[V];
            for (int i = 0; i < V; i++) {
                adj[i] = new ArrayList<>();
            }
        }

        public void addEdge(int u, int v) {
            adj[u].add(v);
        }

        public void bfs(int s) {
            boolean[] visited = new boolean[V];
            Queue<Integer> queue = new ArrayDeque<>();

            visited[s] = true;
            queue.add(s);

            while (!queue.isEmpty()) {
                int u = queue.poll();
                System.out.println(u);

                for (int v : adj[u]) {
                    if (!visited[v]) {
                        visited[v] = true;
                        queue.add(v);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        g.bfs(0);
    }
}


/* OUTPUT */
/*
0
1
2
3
4
 */

