import java.util.Scanner;

class Node {
    int data;
    Node addr;

    Node(int val) {
        data = val;
        addr = null;
    }
}

class Linkedlist {
    Node head = null;

    void InsertAtEnd(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.addr != null) {
            temp = temp.addr;
        }
        temp.addr = newNode;
    }

    void display() {
        if (head == null) {
            System.out.println("Linked list is empty...");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.addr;
        }
        System.out.println();
    }
}

public class li {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linkedlist l = new Linkedlist();

        System.out.println("Enter linked list values (-1 to stop):");

        int num;
        while (true) {
            num = sc.nextInt();
            if (num == -1) {
                break;
            }
            l.InsertAtEnd(num);
        }

        System.out.println("Linked List:");
        l.display();
    }
}
