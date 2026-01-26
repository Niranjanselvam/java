import java.util.Scanner;
class insertatend
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
        {
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
        Scanner sc=new Scanner(System.in);
         insertatend list=new insertatend();
         System.out.println("nodes :");
         int a=sc.nextInt();
         System.out.println("elements :");
         for(int i=0;i<a;i++){
         list.add(sc.nextInt());
         }
         System.out.println("last node :");
         int value=sc.nextInt();
         list.add(value);
         System.out.println("last node :");
         list.display();

    }
}