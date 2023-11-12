package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree {
    Node root;
    static int ind = -1;
    public void insert(Scanner scanner){
        System.out.println("Enter the data for Root Node : ");
        int data = scanner.nextInt();
        root = new Node(data);
        insert(scanner,root);
    }
    public void insert(Scanner scanner,Node node){
        System.out.println("Do you want to insert Node in the Left of "+node.data);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the data for the Node that is Left to "+node.data);
            int data = scanner.nextInt();
            node.left = new Node(data);
            insert(scanner,node.left);
        }

        System.out.println("Do you want to insert Node in the Rigth of "+node.data);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the data for the Node that is Right to "+node.data);
            int data = scanner.nextInt();
            node.right = new Node(data);
            insert(scanner,node.right);
        }
    }
    public void displayTree(){
        if(root == null){
            return;
        }
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
    public Node createTree(int [] nodes){
        ind++;
        if(nodes[ind] == -1){
            return null;
        }
        Node node = new Node(nodes[ind]);
        node.left = createTree(nodes);
        node.right = createTree(nodes);

        return node;
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

        while (!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.print(curr.data+" ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }
    public int countOfNode(Node root){
        if(root == null){
            return 0;
        }
        return countOfNode(root.left)+countOfNode(root.right)+1;
    }
    public int sumOfNode(Node root){
        if(root == null){
            return 0;
        }
        return countOfNode(root.left)+countOfNode(root.right)+1;
    }
    public void deleteNode(int root){
        
    }
}
