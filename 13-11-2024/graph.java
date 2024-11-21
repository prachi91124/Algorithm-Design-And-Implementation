import java.util.*;

public class DFS {
    public static void main(String[] args) {

    }

    class Graph {
        int V;
        List<Integer>[] adjList;

        public Graph(int V) {
            this.V = V;
            adjList = new List[V];
            for (int i = 0; i < V; i++) {
                adjList[i] = new ArrayList<>();
            }
        }

        int add(int v1, int v2) {
            adjList[v1].add(v2);
            return v2;
        }

        void BFS(int startVertex) {
            boolean[] isVisited = new boolean[V l];
            Queue<Integer> q = new LinkedList<>();

            isVisited[startVertex] = true;
            q.add(startVertex);

            while (!q.isEmpty()) {
                int vertex = q.poll();
                System.out.println(vertex);
                for (int ele : adjList[startVertex]) {
                    if (!isVisited[ele]) {
                        q.add(null);
                        isVisited[ele] = true;
                    }
                }
            }
        }

        void DFS(int startVertex) {
            boolean[] vis = new boolean[];
            DFShelper(startVertex, vis);
        }
        

        void DFShelper(int startVertex, boolean[] vis) {
            vis[startVertex] = true;
            System.out.println(startVertex);

            for (int ele : adjList[startVertex]) {
                if (!vis[startVertex]) {
                    DFShelper(ele, vis);
                }
            }
        }
    }
}