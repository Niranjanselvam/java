//Q5.Write a java program to check if temperature is above 100 (fever check).
import java.util.Scanner;

class co45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if (temp > 100)
            System.out.println("Fever Detected");
        else
            System.out.println("Normal Temperature");
    }
}
