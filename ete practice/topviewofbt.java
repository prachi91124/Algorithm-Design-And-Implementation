import java.util.*;
// Other imports go here
// Do NOT change the class name
public class topviewofbt
{
    public static void main(String[] args)
    {
        // Write your code here
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // Call the topview method
        Result.topview(root);
    }
    }

class Node{
    int data;
    Node left;
    Node right;

    //Default Constructor
    public Node(){
        data = 0;
    }

    //Parametrised Constructor
    public Node(int d){
        data = d;
    }
}

//Creating a helper class
class Result{
    static class Pair{
        int hd;
        //an instance of node class that gets us a tree node
        Node node;

        //parametrised constructor
        public Pair(Node n, int hdist){
            this.node = n;
            this.hd = hdist;
        }
    }

    static void topview(Node root/*instance of class Node that gives us tree node needs to be taken*/){
        if(root == null) return;

        TreeMap<Integer,Integer> map = new TreeMap<>();
        Queue <Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));

        while(!q.isEmpty()){
            Pair curr = q.poll();
            int hd = curr.hd;
            Node node = curr.node;

            if(!map.containsKey(hd)) map.put(hd,node.data);
            if(node.left!= null) q.offer(new Pair(node.left,hd-1));
            if(node.right!= null) q.offer(new Pair(node.right,hd+1));
        }

        for(int n : map.values()){
             System.out.print(n+" ");
        }
    }
}