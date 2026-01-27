import java.util.Scanner;
class countnodes
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
         node head = null;

    void insertatend(int data) 
    {
        node newNode = new node(data);
        if (head == null) 
        {
            head = newNode;
            return;
        }
        node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    int countnodes() {
        int count = 0;
        node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
        public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            countnode list=new countnode();
            System.out.println("Nodes :");
            int a=sc.nextInt();
            System.out.println("Enter elements :");
            for(int i=0;i<a;i++)
            {
            list.insertatend(sc.nextInt());
            }
            System.out.println("no of nodes :"+list.countnodes());
        }
}