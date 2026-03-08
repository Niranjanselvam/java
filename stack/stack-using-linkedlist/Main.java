import java.util.Scanner;

public class Main {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null; // top of stack

    // Push operation
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top; // new node points to current top
        top = newNode;      // update top
        System.out.println(data + " pushed into stack");
    }

    // Pop operation
    public void pop() {
        if (top == null) {
            System.out.println("Stack Underflow - stack is empty");
            return;
        }
        System.out.println(top.data + " popped from stack");
        top = top.next; // remove top node
    }

    // Peek operation
    public void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + top.data);
        }
    }

    // Display stack
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements (top to bottom):");
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

 
    public static void main(String[] args) {
        Main stack = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            stack.push(value);
        }

        stack.display();
        stack.peek();
        stack.pop();
        stack.display();

        sc.close();
    }
}