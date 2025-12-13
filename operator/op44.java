
import java.util.Scanner;

//Q10.Write a java Program to calculate Salary of Employee
public class op44
{                                                       //
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int total=sc.nextInt();
        int pf =total*8/100;
        int ins=total*5/100;
        int finalsalary=total-pf-ins;
        System.out.println(finalsalary);

    }
}