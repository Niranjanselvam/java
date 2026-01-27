import java.util.*;

class Node
{
    int data;
    Node addr;
    Node(int value)
    {
        data=value;
        addr=null;
    }
}

public class k
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Node head=null,tail=null;

        for(int i=0;i<n;i++)
        {
            int v=sc.nextInt();
            Node nn=new Node(v);
            if(head==null)
            {
                head=nn;
                tail=nn;
            }
            else
            {
                tail.addr=nn;
                tail=nn;
            }
        }

        int ec=0,oc=0;
        Node t=head;

        while(t!=null)
        {
            if(t.data%2==0) ec++;
            else oc++;
            t=t.addr;
        }

        int[] even=new int[ec];
        int[] odd=new int[oc];

        int ei=0,oi=0;
        t=head;

        while(t!=null)
        {
            if(t.data%2==0) even[ei++]=t.data;
            else odd[oi++]=t.data;
            t=t.addr;
        }

        for(int i=even.length-1;i>=0;i--)
            System.out.print(even[i]+" ");

        for(int i=0;i<odd.length;i++)
            System.out.print(odd[i]+" ");
    }
}