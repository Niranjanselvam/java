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
    public void begin(int data)
    {
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;

        
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
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
        int val=sc.nextInt();
        list.begin(val);
        list.display();
    }
}