class linkedlist
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
        node newnode =new  node(data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
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
        node temp=head;
        if(head==null)
        {
          System.out.println("list is empty");  
        }
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[]args)
    {
        linkedlist list=new linkedlist();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.display();
    }
}