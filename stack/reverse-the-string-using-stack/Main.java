import java.util.*;
class Stack{
    char[] letter;
    int size;
    int top=-1;
    Stack(int size){--
        this.size=size;
        letter=new char[size];
    }
   
    public void push(char data){
        if(top==size-1){
            System.out.println("Stcak is full");
        }
        letter[++top]=data;
       
    }
    public char pop(){
        if(top==-1){
            System.out.println("Stcak is empty");
        }
        return letter[top--];
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        Stack s=new Stack(n);
        for(int i=0;i<n;i++){
            s.push(str.charAt(i));
        }
   
    String reversed=" ";
    for(int i=0;i<n;i++){
        reversed+=s.pop();
    }
    System.out.println("reversed string"+reversed);
}}
