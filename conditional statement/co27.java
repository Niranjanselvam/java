//Write a Java Program to check whether a triangle is right-angled or not.
import java.util.Scanner;

public class co27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=a+b+c;
        if(d==90)
        {
            System.out.println("right angle");
        }
        
        else
        {
            System.out.println("no");
        }
    }
}
