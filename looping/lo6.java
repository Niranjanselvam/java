
import java.util.Scanner;

//Q6. Write a Java program to check whether a number is palindrome or not.
public class lo6
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rev=0;
        int o=a;
        while(a!=0)
        {
            int r=a%10;
            rev=rev*10+r;
            a=a/10;
        }
        if(rev==o)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("no palindrome");
        }
    }
}