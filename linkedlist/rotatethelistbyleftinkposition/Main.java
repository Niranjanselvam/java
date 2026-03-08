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
    public void rotate(int k)
    {
        if(head==null||k==0||head.next==null)
        {
            return;
        }
        //length and lastnode
        node temp=head;
        int length=1;
        while(temp.next!=null)
        {
            temp=temp.next;
            length++;
            
        }
        temp.next=head;
        k=k%length;
        /*int steps=length-k;*/
        node newtail=head;
        for(int i=1;i<k;i++)
        {
            newtail=newtail.next;
        }
        head=newtail.next;
        newtail.next=null;
    }
    public void display()
    {
        if(head==null)
        {
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
        while(a!=-1)
        {
            list.add(a);
            a=sc.nextInt();
        }
        int k=sc.nextInt();
        list.rotate(k);
        list.display();
    }
}