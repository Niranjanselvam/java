import java.util.*;
class Stack {
    int[] arr;
    int top;

    Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    void push(int val) {
        arr[++top] = val;
    }

    int pop() {
        return arr[top--];
    }

    int peek() {
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}


public class Main{

    static void calculateSpan(int[] prices, int n, int[] span) {

        Stack stack = new Stack(n);

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];
        int[] span = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        calculateSpan(prices, n, span);

        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}