package Tree;

import java.util.Scanner;
// This tree tutorials...
public class DiameterOfTree {
    static Scanner sc=null;
    public static void main(String[] args) {
     sc = new Scanner(System.in);
     Node root =createNode();
     System.out.println(diameter(root));

    }
    public static int diameter(Node root){
        if (root==null) return Integer.MIN_VALUE;
        int dl = diameter(root.left);
        int dr = diameter(root.right);
        int curr = height(root.left)+height(root.right)+1;
        return Math.max(curr,Math.max(dl,dr));
    }
    public static int height(Node root){
        if (root==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    static Node createNode(){
        int data = sc.nextInt();
        Node root = new Node(data);
        if (data==-1) return null;
        System.out.println("Enter Left: "+data);
        root.left = createNode();
        System.out.println("Enter Right: "+data);
        root.right = createNode();
        return root;
    }
}
