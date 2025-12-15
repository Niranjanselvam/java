//Q4. Write a Java program to print the product of digits of a given number.
import java.util.Scanner;
public class lo4
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int pro=1;
        for(int i=1;i<=a;i++)
        {
            pro*=i;
        }
        System.out.println(pro);
    }
}