//Find cycle in a directed graph

import java.util.List;
import java.util.ArrayList;

public class cycle2 {
    public static void main(String[] args) {
        Graph g1 = new Graph(6);
        g1.add(1, 2);
        g1.add(1, 3);
        g1.add(4, 2);
        g1.add(5, 2);
        g1.add(3, 5);
        g1.add(6, 4);
        if(g1.isCycle(g1)){
            System.out.println("Cycle Exists");
        }
        else{
            System.out.println("Cycle Doesn't Exists");
        }
    }
}

class Graph{
    int v;
    List<Integer>[] adjList;

    public Graph(int v){
        this.v = v;
        adjList = new List[v+1]; //hum nayi List create kr rhe hh naa ki array toh elts list hone chahiye kyuki humne hr idx pr ek list store krni h instead of int
        //now we will initialize a list at each index of adjacency list which is till now null;
        for(int i = 0; i <= v; i++){
            adjList[i] = new ArrayList<>(); //hr ek idx pr arraylist de di
        }
    }
    //now create an add fn
    void add(int v1, int v2){
        adjList[v1].add(v2);
        adjList[v2].add(v1);
    }

     boolean isCycle(Graph g1){
        boolean [] vis = new boolean[v+1];

        for(int i = 0; i <= v; i++){
            if(!vis[i]){
                if(isCycleUtil(i,vis,-1)) return true;
            }
        }
        return false;
    }

    boolean isCycleUtil(int v, boolean[] vis, int parent){
        vis[v] = true;
        for(int nbr : adjList[v]){
            if(!vis[nbr]){
                isCycleUtil(nbr, vis, v);
            }
            else if(parent!=nbr){
                return true;
            }
        }
        return false;
    }
}