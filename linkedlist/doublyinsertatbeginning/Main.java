import java.util.Scanner;
public class Main
{
    class node
    {
        int data;
        node prev;
        node next;
        node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
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
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        
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
    }
}