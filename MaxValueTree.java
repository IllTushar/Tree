package Tree;

import java.util.Scanner;

public class MaxValueTree {
    static Scanner sc =null;
    public static void main(String[] args) {
     sc = new Scanner(System.in);
     Node root = createNode();
        System.out.println(MaxValue(root));
    }
    public static int MaxValue(Node root){
        if (root==null)return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(MaxValue(root.left),MaxValue(root.right)));
    }
    public static Node createNode(){
        int data = sc.nextInt();
        Node root = new Node(data);
        if (data == -1) return null;
        System.out.println("Enter left: "+data);
        root.left = createNode();
        System.out.println("Enter right: "+data);
        root.right = createNode();
        return root;

    }
}
