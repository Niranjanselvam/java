//Q22. Write a Java program to multiply two numbers without using * operator.
import java.util.Scanner;
public class lo21
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=0;
        for(int i=0;i<b;i++)
        {
            res+=a;
        }
        System.out.println(res);
    }
}