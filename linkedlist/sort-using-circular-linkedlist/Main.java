import java.util.Scanner;
class node{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class Main
{
    static node head=null;
    static void insert(int data)
    {
        node newnode=new node(data);
        if(head==null)
        {
            head=newnode;
            newnode.next=head;
        }
        else
        {
            node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.next=head;
        }
    }
    static int countnode()
    {
        if(head==null)
        return 0;
        int count=0;
        node temp=head;
        do{
            count++;
            temp=temp.next;
        }
        while(temp!=head);
        return count;
    }
        static void sort()
        {
            int n=countnode();
            for(int i=0;i<n-1;i++)
            {
                node current=head;
                for(int j=0;j<n-1;j++)
                {
                    node nextnode=current.next;
                if(current.data>nextnode.data)
                {
                    int temp=current.data;
                    current.data=nextnode.data;
                    nextnode.data=temp;
                }
                current=current.next;
            }
        }
    }
    static void display()
    {
        if(head==null)
        
            return;
            node temp=head;
            do{
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            while(temp!=head);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            insert(sc.nextInt());
        }
        sort();
        display();
        
    }
}