public class topviewofbt {
    public static void main(String[] args) {
        
    }    
}

//create a binary tree
class Node{
    int data; //value that you want to enter in bt
    Node left;
    Node right;

    Node(int d){
        //parameterised constructor
        this.data = d;
        Node left = null;
        Node right = null;//as root doesn't has any children at this point
    }
}