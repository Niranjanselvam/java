//Q3.Write a java Program to check whether a person is eligible for senior citizen benefits (age ≥ 60)
import java.util.Scanner;

class co43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 60)
            System.out.println("Eligible for Senior Citizen Benefits");
        else
            System.out.println("Not Eligible");
    }
}
