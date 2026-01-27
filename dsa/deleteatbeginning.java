import java.util.Scanner;
class deleteatbeginning{
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
    public void deletebeginning()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        head=head.next;

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
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        deleteatbeginning list=new deleteatbeginning();
        System.out.println("nodes :");
        int a=sc.nextInt();
        System.out.println("Elements :");
        for(int i=0;i<a;i++)
        {
            list.add(sc.nextInt());
        }
        list.deletebeginning();
        System.out.println("output :");
        list.display();
    }
}