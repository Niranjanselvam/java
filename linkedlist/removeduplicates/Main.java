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
    public void duplicates()
    {
        node current=head;
        while(current!=null)
        {
            node temp=current;
            while(temp.next!=null)
            {
                if(temp.next.data==current.data)
                {
                    temp.next=temp.next.next;
                }
                else{
                    temp=temp.next;
                }
            }
            current=current.next;
        }
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
        list.duplicates();
        list.display();
    }
}