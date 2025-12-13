import java.util.Scanner;
public class co45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int pf = salary * 8 / 100;
        int ins = salary * 5 / 100;
        System.out.println(salary - pf - ins);
    }
}
