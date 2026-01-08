import java.util.Scanner;
public class a11
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int first=0;
        int end=a-1;
        while(first<end)
        {
            int temp=arr[first];
            arr[first]=arr[end];
            arr[end]=temp;
            first++;
            end--;
        }
        for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}