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
    public void nthnode(int n)
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        node fast=head;
        node slow=head;
        for(int i=0;i<n;i++)
        {
            if(fast==null)
            {
                System.out.println("less than nth node");
                return;
            }
            fast=fast.next;
        }
        while(fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        System.out.println("nth node is: "+slow.data);
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
        list.nthnode(n);
        
    }

    
}