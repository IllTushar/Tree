package Tree;

import java.util.Scanner;

public class HeightOfTree {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createNode();
        System.out.println(Height(root));
    }
    public static Node createNode(){
        Node root = null;
        int data = sc.nextInt();
        root = new Node(data);
        if (data==-1) return null;
        System.out.println("Enter Left: "+data);
        root.left = createNode();
        System.out.println("Enter Right: "+data);
        root.right = createNode();
        return root;
    }
    public static int Height(Node root){
        if (root==null) return 0;
        return Math.max(Height(root.left),Height(root.right))+1;
    }
}
