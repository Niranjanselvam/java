//Q17.Write a java program to assign different ticket prices based on day of the week (weekday/weekend).
import java.util.Scanner;

class co56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();

        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday"))
            System.out.println("Weekend Price: ₹300");
        else
            System.out.println("Weekday Price: ₹200");
    }
}
