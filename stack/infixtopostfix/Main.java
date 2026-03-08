import java.util.Scanner;
class node
{
	char data;
	node next;
	node(char data)
	{
		this.data=data;
		this.next=null;
	}

}
class stack
{
	node top;
	void push(char x)
	{
		node newnode=new node(x);
		newnode.next=top;
		top=newnode;
	}
	char pop()
	{
		if(top==null)
		{

			return '\0';
		}
	
	char x=top.data;
	top=top.next;
	return x;
    }
    char peek()
    {
	    if(top==null)
		    return '\0';
	    return top.data;
    }
    boolean isempty()
    {
	return top==null;
    }
}
public class Main
{
    static boolean isoperand(char c)
    {
        return Character.isLetterOrDigit(c);
    }
    static int precedence(char c)
    {
        switch(c)
        {
            case'+':
                case'-':
                    return 1;
                    case'*':
                        case'/':
                            return 2;
                            case'^':
                                return 3;
        }
        return -1;
    }
    static String infixtopostfix(String exp)
    {
        stack stack=new stack();
        String result="";
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);
            if(isoperand(c))
            {
                result+=c;
            }
            else if(c=='(')
            {
                stack.push(c);
            }
            else if(c==')')
            {
                while(!stack.isempty()&&stack.peek()!='(')
                {
                    result+=stack.pop();
                }
                stack.pop();
            }
            else
            {
                while(!stack.isempty()&&precedence(c)<=precedence(stack.peek()))
                {
                    result+=stack.pop();
                }
                stack.push(c);
            }
        }
        while(!stack.isempty())
        {
            result+=stack.pop();
        }
        return result;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String exp=sc.nextLine();
        System.out.println(infixtopostfix(exp));
    }
}