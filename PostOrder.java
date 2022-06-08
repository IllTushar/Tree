package Tree;

import java.util.Scanner;

public class PostOrder {
    static Scanner sc =null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createNode();
        PostOrder(root);
        System.out.println();
    }
    public static void PostOrder(Node root){
        if (root==null)return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
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
