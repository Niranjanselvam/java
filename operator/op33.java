//13 Formula Based Write a Java Program to find surface area and volume of a cuboid.
import java.util.Scanner;

public class op33{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int l= sc.nextInt();
        int b= sc.nextInt();
        int h= sc.nextInt();

        System.out.println("surface area of cuboid:"+2*(l*b + b*h + h*l));
        System.out.println("volume of cuboid:"+(l * b * h));

    }
}
