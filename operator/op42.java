//7 Scenario Based Q7.Write a java Program to Distribute Candies Equally Among People
// 7 Scenario Based Q7. Write a Java Program to Distribute Candies Equally Among People
import java.util.Scanner;

public class op42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candies = sc.nextInt();
        int people = sc.nextInt();
        int eachGets = candies / people;     // candies per person
        int remaining = candies % people;    // leftover candies

        System.out.println("Each person gets: " + eachGets + " candies");
        System.out.println("Remaining candies: " + remaining);

        sc.close();
    }
}
