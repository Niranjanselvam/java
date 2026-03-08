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
    public void occurence(int n)
    {
        while(head!=null&&head.data==null)
        {
            head=head.next;
        }
        node temp=head;
        while(temp!=null&&temp.next!=null)
        {
            if(temp.next.data==n)
            {
                temp.next=temp.next.next;
            }
            else
            {
                temp=temp.next;
            }
        }
    }
    public static void main(String[]args)
    {
        Main list=new Main();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            list.add(sc.nextInt());
        }
        int n=sc.nextInt();
        list.occurence(n);
        list.display();
    }
}