
import java.util.Scanner;

//Q2. Write a Java program to calculate the sum of digits of a given number.
public class lo2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}