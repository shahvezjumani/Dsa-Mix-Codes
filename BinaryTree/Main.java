package BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tree tree = new Tree();
//        tree.insertNode(scanner);
//        tree.display();
        int [] nodes = {15,6,7,-1,-1,-1,8,-1,-1};
        Node root = tree.getRoot(nodes);
//        System.out.println(root.data);
                tree.levelOrder(root);
    }
}
