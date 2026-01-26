import java.util.Scanner;
public class s2 {
    public static void main(String[] args) {
        int n = 10; // number of terms

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (i < n) {
                System.out.print(square + ",");
            } else {
                System.out.print(square + "."); // last term ends with a period
            }
        }
    }
}
