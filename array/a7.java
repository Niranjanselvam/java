//Q7. Write a Java program to count the number of zeroes in an array.
import java.util.Scanner;
public class a7
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
        int count=0;
        for(int num:arr)
        {
            if(num==0)
            {
                count++;
            }
        }
        System.out.println("count: "+ count);
    }
}