import java.util.Scaner;
public class Main
{
    class node
    {
        int data;
        node next;
        node prev;
        node(int data)
        {
            this.data=data;
        }
    }
    node head=null
    static void insert(int data)
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
    static void remove()
    {
        node current=head;
        while(cuurent!=null)
        {
            node runner=current.next;
            while(runner!=null)
            {
                if(runner.data==current.data)
                {
                    node nextnode=runner.next;
                    if(runner.prev!=null)
                        runner.prev.next=runner.next;
                    if(runner.next!=null)
                        runner.next.prev=runner.prev;
                        runner=newnode;
                }
                else
                {
                    runner=runner.next;
                }
            }
            current=current.next;
        }
    }
    static void display()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            if(temp.next!=null)
            {
                System.out.println(" ");
                temp=temp.next;
            }
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
        list.remove();
        list.display();
    }
}