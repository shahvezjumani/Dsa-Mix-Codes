package BinaryTree;

import java.util.*;
import java.util.Scanner;

public class Tree {
    Node root;
    static int ind = -1;
    public void insertNode(Scanner scanner){
        System.out.print("Enter the key of root node : ");
        int key = scanner.nextInt();
        root = new Node(key);
        insertNode(scanner,root);

    }
    public void insertNode(Scanner scanner,Node node){
        if(node == null){
            return;
        }
        System.out.println("Do you want to insert node in the left of the node value: "+node.data);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.print("Enter the key of left node : ");
            int key = scanner.nextInt();
            node.left = new Node(key);
            insertNode(scanner,node.left);
        }

        System.out.println("Do you want to insert node in the right of the node value: "+node.data);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.print("Enter the key of right node : ");
            int key = scanner.nextInt();
            node.right = new Node(key);
            insertNode(scanner,node.right);
        }
    }
    public void display(){
        display(root);
    }
    public void display(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        display(node.left);
        display(node.right);
    }
    public Node getRoot(int [] nodes){
        ind++;
        if(nodes[ind] == -1){
            return null;
        }
        Node node = new Node(nodes[ind]);
        node.left = getRoot(nodes);
        node.right = getRoot(nodes);

        return node;
    }
    public void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currnode = q.remove();
            if(currnode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else {
                System.out.print(currnode.data+" ");
                if(currnode.left != null){
                    q.add(currnode.left);
                }
                if(currnode.right != null){
                    q.add(currnode.right);
                }
            }
        }
    }
}
