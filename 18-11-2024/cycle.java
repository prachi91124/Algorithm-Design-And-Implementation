//Find cycle in an directed graph

import java.awt.List;
import java.util.ArrayList;

public class cycle {
    public static void main(String[] args) {
        
    }
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
        
        boolean isCycle(){
            boolean[] vis = new boolean[v+1];
            boolean[] currpath = new boolean[v+1];

            for(int i = 0; i <= v; i++){
                if(!vis[i]){
                    if(isCycleUtil(i,vis,currpath)) return true;
                }
            }
            return false;
        }

        boolean isCycleUtil(int v, boolean [] vis, boolean [] currpath){
            vis[v] = true;
            currpath[v] = true;

            for(int nbr:adjList[v]){
                if(!vis[ele]){
                    isCycleUtil(ele, vis, currpath);
                }
                else if(currpath[ele]){
                    return true;
                }
            }
            currpath[v] = false;
            return false;
        }
    }
}
