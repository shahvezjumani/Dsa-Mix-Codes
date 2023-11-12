package Trees;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,2,-1,-1};
        Tree tree = new Tree();
        Node root = tree.createTree(nodes);
//        tree.insert(scanner);
        tree.display(root);
        System.out.println();
        tree.levelOrder(root);
    }
}
