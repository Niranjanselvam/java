// Q6. Write a Java program to count the number of odd elements in an array.
import java.util.Scanner;
public class a6
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        int sum=0;
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0)
            {
                sum+=arr[i];
            }
        }
        System.out.println("the odd sum is"+sum);
    }
}