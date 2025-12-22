//Q12. Write a Java Program to print the character for the given ASCII value.
import java.util.Scanner;
public class charascii
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ascii=sc.nextInt();
        char ch=(char)ascii;
        System.out.println(ch);
    }
}
 