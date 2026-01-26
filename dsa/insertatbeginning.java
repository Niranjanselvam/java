import java.util.Scanner;
class insertatbeginning
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
        newnode.next=head;
        head=newnode;

    }
    public void display()
    {
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
        insertatbeginning list= new insertatbeginning();
        System.out.println("nodes :");
        int a=sc.nextInt();
        System.out.println("beginning :");
        for(int i=0;i<a;i++)
        {
            list.add(sc.nextInt());
        }
        System.out.println("beginning elements");
        int value=sc.nextInt();
        list.add(value);
        System.out.println("final :");
        list.display();
    }
}