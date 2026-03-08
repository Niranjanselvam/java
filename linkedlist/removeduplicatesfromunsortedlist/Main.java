import java.util.Scanner;

public class Main
{
    static class node
    {
        int data;
        node next;

        node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }


    static node insert(node head, int val)
    {
        node newnode = new node(val);

        if(head == null)
            return newnode;

        node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newnode;
        return head;
    }

    
    static node duplicates(node head)
    {
        node curr = head;

        while(curr != null)
        {
            node temp = curr;

            while(temp.next != null)
            {
                if(temp.next.data == curr.data)
                {
                    temp.next = temp.next.next;
                }
                else
                {
                    temp = temp.next;
                }
            }

            curr = curr.next;
        }

        return head;
    }


    static void display(node head)
    {
        node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            node head = null;

            for(int i = 0; i < n; i++)
            {
                head = insert(head, sc.nextInt());
            }

            head = duplicates(head);
            display(head);
        }
    }
}