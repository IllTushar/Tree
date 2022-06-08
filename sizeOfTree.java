package Tree;

import java.util.Scanner;

public class sizeOfTree {
    static Scanner sc =null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root =createNode();
        System.out.println(sizeOfTree(root));
    }
    public static int sizeOfTree(Node root){
        if (root==null) return 0;
        return sizeOfTree(root.left)+sizeOfTree(root.right)+1;
    }
    public static Node createNode(){
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
