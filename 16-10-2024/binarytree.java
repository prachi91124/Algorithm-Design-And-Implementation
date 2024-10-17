import java.util.LinkedList;
import java.util.Queue;


public class binarytree {
    public static void main(String[] args) {
        Binarytree tree = new Binarytree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(4);
    }
}

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree{
    Node root;

    BinaryTree(){
        this.root = null;
    }

    void inorder(Node root){
        if(root == null) return;

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    void preorder(Node root){
        if(root == null) return;

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    void postorder(Node root){
        if(root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    void levelorder(Node root){
        if(root == null) return;

        Queue<Node>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.println(temp.data);

            if(temp.left  != null){
                q.add(temp.left);
            }
            if(temp.right  != null){
                q.add(temp.right);
            }
        }
    }
}

class BST{
    Node root;

    BST(){
        this.root = NULL;
    }

    void insert(int val){
        if(root == null){
            root = add(val);
        }
    }

    Node add(int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val>root.data){
            root.left = add(val);
        }
        if(val > root.data){
            root.right = add(val);
        }
        return root;
    }
}