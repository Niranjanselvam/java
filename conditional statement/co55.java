//Q16.Write a java program to validate a mobile number . If it has 10 digits print “Valid Number” otherwise print “Invalid Number”.
import java.util.Scanner;

class co55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mobile = sc.next();

        if (mobile.length() == 10)
            System.out.println("Valid Number");
        else
            System.out.println("Invalid Number");
    }
}
