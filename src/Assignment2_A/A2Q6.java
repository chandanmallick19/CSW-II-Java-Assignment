/*
Write a java program to traverse a graph using depth first search (use
Stack collection ).
 */

package Assignment2_A;
import java.util.*;

public class A2Q6 {

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

        public void dfs(int s) {
            boolean[] visited = new boolean[V];
            Stack<Integer> stack = new Stack<>();

            visited[s] = true;
            stack.push(s);

            while (!stack.isEmpty()) {
                int u = stack.pop();
                System.out.println(u);

                for (int v : adj[u]) {
                    if (!visited[v]) {
                        visited[v] = true;
                        stack.push(v);
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

        g.dfs(0);
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