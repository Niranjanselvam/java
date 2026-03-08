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
    public  void add(int data)
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
    public void remove(int n)
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        if(n==1)
        {
            head=head.next;
            return;
        }
        node temp=head;
        for(int i=0;i<n;i++)
        {
            if(temp.next==null)
            {
                System.out.println("invalid node");
                return;
            }
            temp=temp.next;
        }
        if(temp.next==null)
        {
            System.out.println("invalid");
            return;
        }
        temp.next=temp.next.next;
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        Main list=new Main();
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            list.add(sc.nextInt());
        }
        int n=sc.nextInt();
        list.remove(n);
        list.display();
    }
}