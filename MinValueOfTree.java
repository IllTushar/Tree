package Tree;

import java.util.Scanner;

public class MinValueOfTree {
    static Scanner sc = null;
    public static void main(String[] args) {
     sc = new Scanner(System.in);
     Node root = createNode();
        System.out.println(miniValue(root));
    }
    public static int miniValue(Node root){
        if (root==null) return Integer.MAX_VALUE;
        return Math.min(root.data, Math.min(miniValue(root.left),miniValue(root.right)));
    }
    static Node createNode(){
        int data = sc.nextInt();
        Node root = new Node(data);
        if (data==-1) return null;
        System.out.println("Enter left: "+data);
        root.left = createNode();
        System.out.println("Enter right: "+data);
        root.right = createNode();
        return root;
    }
}
