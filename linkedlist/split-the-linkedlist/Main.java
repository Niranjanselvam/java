import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public int length() {
        int len = 0;
        Node temp = head;
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    public Node[] split(int k) {
        Node[] parts = new Node[k];
        int totalLen = length();
        int n = totalLen / k;
        int r = totalLen % k;

        Node current = head;
        for(int i = 0; i < k && current != null; i++) {
            parts[i] = current;
            int partSize = n + (r > 0 ? 1 : 0);
            r--;
            for(int j = 1; j < partSize; j++) {
                current = current.next;
            }
            Node next = current.next;
            current.next = null;
            current = next;
        }

        return parts;
    }

    public void display(Node node) {
        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int k = sc.nextInt();
        Node[] parts = list.split(k);

        for(int i = 0; i < k; i++) {
            /*System.out.print("Part " + (i+1) + ": ");*/
            if(parts[i] != null) {
                list.display(parts[i]);
            } else {
                System.out.println("null");
            }
        }

   
    }
}