
import java.util.Scanner;

//Q19. Write a Java program to check whether a given number is an Automorphic Number or not.
public class lo18
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int o=a;
        int m=a*a;
        int n=m%10;
        if(o==n)
        {
            System.out.println("automorphic number");
        }
        else
        {
            System.out.println("no");
        }
    }
}