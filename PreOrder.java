package Tree;

import java.util.Scanner;

//import static Tree.Node.createNode;

public class PreOrder {
    static Scanner sc =null;
    public static void main(String[] args) {
      sc = new Scanner(System.in);
      Node root = createNode();
      PreOrder(root);
        System.out.println();
    }
    public static void PreOrder(Node root){
        if (root==null) return;
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    static Node createNode(){
        Node root = null;
        int data = sc.nextInt();
        root = new Node(data);
        if (data==-1) return null;
        System.out.println("Left data: "+data);
        root.left = createNode();
        System.out.println("Right data: "+data);
        root.right = createNode();
        return root;
    }
}
