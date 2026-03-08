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
    public void deleteatend()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        if(head.next==null)
        {
            head=null;
        }
        node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    public void display()
    {
        if(head==null)
        {
            System.out.print("List is empty");
            return;
        }
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
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
        list.display();
        System.out.println();
        list.deleteatend();
        System.out.println();
        list.display();
    }
}