import java.util.Scanner;
public class Main
{
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
    node head=null;
    public void add(int data)
    {
        node newnode=new node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public void nthbeginning(int n)
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        node temp=head;
        int count=1;
        while(temp!=null&&count<n)
        {
            temp=temp.next;
            count++;
        }
        if(temp==null)
        {
            System.out.println("less than the given node");
            return;
        }
        else
        {
            System.out.println("the given node is: "+temp.data);
        }
    }
    public static void main(String[]args)
    {
        Main list=new Main();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a!=-1)
        {
            list.add(a);
            a=sc.nextInt();
        }
        int n=sc.nextInt();
        list.nthbeginning(n);
    }
}