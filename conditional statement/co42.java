//Q2.Write a java Program to check whether a person is eligible to vote (age ≥ 18)
import java.util.Scanner;

class co42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18)
            System.out.println("Eligible to Vote");
        else
            System.out.println("Not Eligible to Vote");
    }
}
