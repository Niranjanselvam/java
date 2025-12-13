
import java.util.Scanner;

//Write a Java Program to check whether four sides form a square or rectangle.
public class co30
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(a==b&&b==c&&c==d)
        {
            System.out.println("square");
        }
        else if(a==c&&b==d)
        {
                System.out.println("rectangle");
        }
        else
        {
            System.out.println("not a square and rectanglerectangle");
        }
    }
}