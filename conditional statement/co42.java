//Q7.Write a java Program to Distribute Candies Equally Among People
import java.util.Scanner;
public class co42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candies = sc.nextInt();
        int people = sc.nextInt();
        System.out.println(candies / people);
    }
}
