import java.util.*;

class Stack {
    int size;
    int[] arr;
    int top = -1;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }
    public void increment(int k,int val){
        int limit=Math.min(k,top+1);
        for(int i=0;i<limit;i++){
            arr[i]+=val;
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int n = sc.nextInt();

        Stack s = new Stack(n);

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }

        System.out.println("Stack elements:");
        s.display();
        int k=sc.nextInt();
        int val=sc.nextInt();
        s.increment(k,val);
        System.out.println("After increment");
        s.display();
       
    }
}
