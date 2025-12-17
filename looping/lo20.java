
import java.util.Scanner;

//Q21. Write a Java program to check whether a given integer is a power of 3 or not.
public class lo20
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if(a%3==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}