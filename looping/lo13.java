//perfect square
import java.util.Scanner;

public class lo13 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); 
        int i;
        for (i = 0; i * i <= number; i++) 
        {
            if (i * i == number) 
            {
                System.out.println(number + " is a perfect square.");
                break; 
            }
        }
        
        if (i * i > number) 
            { 
            System.out.println(number + " is not a perfect square.");
            }
    }
}
