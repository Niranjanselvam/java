import java.util.Scanner;

public class op20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        int marks1=sc.nextInt();
        String result = (marks >= marks1/2) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
    }
}