import java.util.Scanner;
class deleteatend
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
            System.out.println("List is empty");
            return;
        }
        node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public void deleteatend()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    public static void main(String[]args)
    {
        deleteatend list=new deleteatend();
        Scanner sc=new Scanner(System.in);
        System.out.println("nodes :");
        int a=sc.nextInt();
        System.out.println("Elements :");
        for(int i=0;i<a;i++)
        {
            list.add(sc.nextInt());
        }
        list.deleteatend();
        System.out.println("Output :");
        list.display();


    }
}