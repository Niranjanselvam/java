//Q6.Write a java program to check pass/fail based on marks (marks ≥ 35 = pass).
import java.util.Scanner;

class co46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks >= 35)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
