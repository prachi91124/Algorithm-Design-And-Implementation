import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class adjmat {
    public static void main(String[] args) {
        int v = 6;
        int [][] adjmat = new int[v+1][v+1];
        adjmat[0][1] = 1;
        adjmat[0][3] = 1;
        adjmat[1][0] = 1;
        adjmat[1][2] = 1;
        adjmat[2][1] = 1;
        adjmat[3][0] = 1;

        //adjacency list
        List<List<Integer>> adjList = new ArrayList <>();
        for(int i = 0; i < v; i++){
            adjList.add(new ArrayList <> ());
        }
        adjList.get(0).add(1);
        adjList.get(0).add(3);
        adjList.get(1).add(0);
        adjList.get(1).add(2);
        adjList.get(2).add(1);
        adjList.get(3).add(0);

        //edge list
        
        List < List <Integer> > edgeList = new ArrayList<>();
        edgeList.add(new int[] {0,1});
        edgeList.add(new int[] {0,2});
        edgeList.add(new int[] {1,3});
        edgeList.add(new int[] {2,3});
    }    
}