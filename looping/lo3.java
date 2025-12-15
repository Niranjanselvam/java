
import java.util.Scanner;

//Q3. Write a Java program to count the number of digits in a given number.
public class lo3
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        if(a==0)
        {
            System.out.println("1");
        }
        else
        {
        while(a>0)
        {
           count++;
           a=a/10;
        }
        System.out.println(count);
        }
    }
}