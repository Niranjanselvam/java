import java.util.Scanner;
public class Main
{
	public class node
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
	public void cycledet()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		node fast=head;
		node slow=head;
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(fast==slow)
			{
				System.out.println("yes");
				return;
			}
		}
		System.out.println("no");

	}
	public void createCycle(int pos)
    {
        if (head == null) return;

        node temp = head;
        node cycleNode = null;
        int index = 0;

        while (temp.next != null)
        {
            if (index == pos)
            {
                cycleNode = temp;
            }
            temp = temp.next;
            index++;
        }
        temp.next = cycleNode;   
    }

        public void createcycle(int pos)
        {
        if (head == null) 
         return;

        node temp = head;
        node cycleNode = null;
        int index = 0;

        while (temp.next != null)
        {
            if (index == pos)
            {
                cycleNode = temp;
            }
            temp = temp.next;       
            index++;
        }
        temp.next = cycleNode;   
    }
	public static void main(String[]args)
	{
		Main list=new Main();
		Scanner sc=new Scanner(System.in);
		System.out.println("Node:");
		int a=sc.nextInt();
		for(int i=0; i<a; i++)
		{
			list.add(sc.nextInt());
		}
		int pos=sc.nextInt(); 
		if(pos!=-1){
		list.createcycle(pos);
		}
		list.cycledet();

	}
}