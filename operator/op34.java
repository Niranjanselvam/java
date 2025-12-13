//14 Formula Based Write a Java Program to find surface area and volume of a sphere.
import java.util.Scanner;
public class op34
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("surface area of the sphere:"+4*3.14*(a*a));
        System.out.println("volume of the sphere:"+4*(3.14*(a*a))/3);

    }
}