
import java.util.Scanner;

//12 Formula Based Write a Java Program to find surface area, volume, and perimeter of a cube.
public class op32
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double a=sc.nextInt();
        double b=(a*a*a);
        double c=6*(a*a);
        double d=12*a;
        System.out.println("volume:"+b);
        System.out.println("surface area:"+c);
        System.out.println("perimeter:"+d);
    }
}