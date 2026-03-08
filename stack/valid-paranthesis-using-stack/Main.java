import java.util.Scanner;
class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}
class Stack {
    private Node top;
    Stack() {
        top = null;
    }
public void push(char data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
public char pop() {
        if (isEmpty()) {
            return '\0'; 
        }
        char popped = top.data;
        top = top.next;
        return popped;
    }

    
    public char peek() {
        if (isEmpty()) return '\0';
        return top.data;
    }

   
    public boolean isEmpty() {
        return top == null;
    }
}

public class Main {

   
    public static boolean isBalanced(String exp) {
        Stack stack = new Stack();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); 
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; 
                }
                char popped = stack.pop();

                if ((ch == ')' && popped != '(') ||
                    (ch == '}' && popped != '{') ||
                    (ch == ']' && popped != '[')) {
                    return false; 
                }
            }
        }

        return stack.isEmpty(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String exp = sc.nextLine();

        if (isBalanced(exp)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}