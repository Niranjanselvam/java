//20 Number Based Write a Java Program to check whether the ASCII value of a character is even or odd.
import java.util.Scanner;
public class co25 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;
        if (ascii % 2 == 0) 
        {
            System.out.println("ASCII value of '" + ch + "' (" + ascii + ") is EVEN.");
        } 
        else {
            System.out.println("ASCII value of '" + ch + "' (" + ascii + ") is ODD.");
        }
    }
}
