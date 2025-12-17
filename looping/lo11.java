
import java.util.Scanner;

//Q11. Write a Java program to print all factors of a given number.
public class lo11
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i = 1; i<=a; i++) {
            if(a%i==0)
            {
                System.out.println(i);
            }
        }
    }
}