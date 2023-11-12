import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Josephus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        System.out.print("Enter count off number: ");
        int k = sc.nextInt();

        System.out.print("Enter starting position: ");
        int m = sc.nextInt();

        Node head = new Node(1);
        Node prev = head;
        for(int i=2; i<=n; i++) {
            prev.next = new Node(i);
            prev = prev.next;
        }
        prev.next = head;

        Node ptr = head;
        for(int i=1; i<m; i++) {
            ptr = ptr.next;
        }

        while(ptr.next != ptr) {
            for(int i=1; i<k; i++) {
                ptr = ptr.next;
            }
            System.out.print(ptr.next.data + " ");
            ptr.next = ptr.next.next;
            ptr = ptr.next;
        }

        System.out.println(ptr.data);

    }

}