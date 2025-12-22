//Q20. Write a Java Program to print the size of char, int, float, and double.
import java.util.Scanner;
public class datatype
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(Character.BYTES);
        System.out.println(Integer.BYTES);
        System.out.println(Float.BYTES);
    }
}