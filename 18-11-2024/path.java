//Find path in a directed graph

import java.util.ArrayList;
import java.util.List;

public class path {
     class Graph{
        int v;
        List<Integer>[] adjList;

        Graph(int v){
            this.v = v;
            adjList = new List[v+1];
            for(int i = 0; i <= v; i++){
                adjList[i] = new ArrayList<>();
            }
        }

        void add(int v1, int v2){
            adjList[v1].add(v2);
        }
    boolean isPath(int src, int dest){
        boolean[] vis = new boolean[v+1];
        if(isPathUtil(src, dest,vis)) return true;
        return false;
    }
    boolean isPathUtil(int src, int dest, boolean[] vis){
        if(src == dest){
            return true;
        }9
        vis[src] = true;
        for(int ele: adjList[src]){
            if(!vis[ele]){
                if(isPathUtil(ele, dest, vis)) return true;
            }
        }
        return false;
    }
}
}
