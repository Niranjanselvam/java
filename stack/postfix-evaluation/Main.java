import java.util.Scanner;
class node
{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class stack
{
    node top;
    void push(int x)
    {
        node newnode=new node(x);
        newnode.next=top;
        top=newnode;
    }
    int pop()
    {
        if(top==null)
        return 0;
        int x=top.data;
        top=top.next;
        return x;
    }
    boolean isempty()
    {
        return top==null;
    }
}
public class Main
{
    static int evaluatepostfix(String exp)
    {
        stack stack=new stack();
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);
            if(c==' ')
            continue;
        if(Character.isDigit(c))
        {
            stack.push(c-'0');
        }
        else
        {
            int op2=stack.pop();
            int op1=stack.pop();
            switch(c)
            {
                case '+': stack.push(op1 + op2);
                break;
                    case '-': stack.push(op1 - op2);
                    break;
                    case '*': stack.push(op1 * op2); 
                    break;
                    case '/': stack.push(op1 / op2); 
                    break;
                    case '^': stack.push((int)Math.pow(op1, op2)); 
                    break;
            }
        }
    }
    return stack.pop();
}
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    String exp=sc.nextLine();
    int result=evaluatepostfix(exp);
    System.out.println(result);
}
}