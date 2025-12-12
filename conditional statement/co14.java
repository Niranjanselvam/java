
import java.util.Scanner;

//9 Number Based Write a Java Program to check odd or even using bitwise operator.
public class co14
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String b=((a&1)==0)?"even":"odd";
        System.out.println(b);
    }
}