import java.util.Scanner;
public class Main
{
 ``   class node
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
    public void palindrome()
    {
        if(head==null||head.next==null)
        {
            System.out.println("Yes");
            return;
        }
        node slow=head;
        node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        node prev=null;
        node next=null;
        node current=slow;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        node first=head;
        node second=prev;
        while(second!=null)
        {
            if(first.data!=second.data)
            {
                System.out.println("no");
                return;
            }
            first=first.next;
            second=second.next;
        }
        System.out.println("yes");
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
        list.palindrome();
    }
}