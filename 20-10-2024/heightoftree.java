class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        this.root = null;
    }

    void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    void preorder(Node root) {
        if (root == null)
            return;

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(Node root) {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    void levelorder(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.println(temp.data);

            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }
    vvoid height( Node root){
        
    }
}
public class heightoftree {
    public static void main(String[] args) {
        
    }
}
