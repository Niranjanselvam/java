//Write a Java Program to check whether the sum of three angles forms a valid triangle.
import java.util.Scanner;

public class co28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b>c && a+c>b && b+c>a)
        {
            System.out.println("valid angle");
        }
        
        else
        {
            System.out.println("no");
        }
    }
}
