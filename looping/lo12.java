
import java.util.Scanner;

//Q11. Write a Java program to print sum of all factors of a given number.
public class lo12
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        for (int i = 1; i<=a; i++) {
            if(a%i==0)
            {
                System.out.println(i);
                 sum=sum+i;

            }
        }
            System.out.println(sum);

    }
}