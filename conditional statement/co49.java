//Q10.Write a java program to print "Stop / Ready / Go" based on traffic light color.
import java.util.Scanner;

class co49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.next();

        if (color.equalsIgnoreCase("Red"))
            System.out.println("Stop");
        else if (color.equalsIgnoreCase("Yellow"))
            System.out.println("Ready");
        else if (color.equalsIgnoreCase("Green"))
            System.out.println("Go");
        else
            System.out.println("Invalid Signal");
    }
}
