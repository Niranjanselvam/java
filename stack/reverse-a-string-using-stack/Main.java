import java.util.Scanner;

public class Main {
    class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    public void push(char data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public char pop() {
        if (top == null) {
            return '\0';
        }
        char value = top.data;
        top = top.next;
        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Main stack = new Main();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        System.out.println(reversed);
        sc.close();
    }
}