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
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void reverse()
    {
        node prev=null;
        node next=null;
        node current=head;
        while(current!=null)
        {
          next=current.next;
          current.next=prev;
          prev=current;
          current=next;
        }
        head=prev;
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
        list.reverse();
        System.out.println();
        list.display();
    }
}