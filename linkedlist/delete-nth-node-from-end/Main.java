import java.util.Scanner;

public class Main
{
    class node
    {
        int data;
        node next;

        node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    node head = null;

    public void add(int data)
    {
        node newnode = new node(data);

        if (head == null)
        {
            head = newnode;
            return;
        }

        node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newnode;
    }

    public void removeFromEnd(int n)
    {
        if (head == null)
        {
            return;
        }

        node fast = head;
        node slow = head;

        for (int i = 0; i < n; i++)
        {
            if (fast == null)
            {
                return;
            }
            fast = fast.next;
        }

        if (fast == null)
        {
            head = head.next;
            return;
        }

        while (fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next =slow.next.next;
    }

    public void display()
    {
        node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Main list = new Main();

        int a = sc.nextInt();

        for (int i = 0; i < a; i++)
        {
            list.add(sc.nextInt());
        }

        int n = sc.nextInt();
        list.removeFromEnd(n);

        list.display();
    }
}