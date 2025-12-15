//Q15.Write a java program to check whether vehicle speed exceeds 100 km/h.
import java.util.Scanner;

class co54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();

        if (speed > 100)
            System.out.println("Speed Limit Exceeded");
        else
            System.out.println("Speed Within Limit");
    }
}
