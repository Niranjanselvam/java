import java.util.Scanner;
import java.util.Arrays;
public class zerostotheend
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[index++]=arr[i];
            }
        }
        while(index<arr.length)
        {
            arr[index++]=0;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}