// Q1. Write a Java program to get the input from the user and print the array.
import java.util.Scanner;
public class a1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
          
          arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
        System.out.print(arr[i]);
        }

    }
}