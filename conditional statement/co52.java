//Q13.Write a java program to display mobile battery status (full, moderate, low).
import java.util.Scanner;

class co52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int battery = sc.nextInt();

        if (battery > 80)
            System.out.println("Full");
        else if (battery >= 30)
            System.out.println("Moderate");
        else
            System.out.println("Low");
    }
}
