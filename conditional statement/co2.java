
import java.util.Scanner;

//2 Number Based Write a Java Program to find smallest among two numbers.
public class co2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<b)
        {
            System.out.println("A");
        }
        else{
            System.out.println("B");
        }
    }
}