package Tree;
import java.util.*;

//import static Tree.Node.createNode;

public class InorderTravel {
    static Scanner sc = null;
    public static void main(String[] args) {
          sc = new Scanner(System.in);
         Node root = createNode();
         Inorder(root);
        System.out.println();
    }
    public static void Inorder(Node root){
        if (root == null) return;
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
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
