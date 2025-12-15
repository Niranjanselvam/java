//Q14.Write a java program to assign ticket price based on passenger age (child, adult, senior).
import java.util.Scanner;

class co53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 12)
            System.out.println("Child Ticket");
        else if (age < 60)
            System.out.println("Adult Ticket");
        else
            System.out.println("Senior Ticket");
    }
}
