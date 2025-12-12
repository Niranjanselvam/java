//4 Scenario Based Q4.Write a java Program to Calculate the Distance Travelled
import java.util.Scanner;
public class op39
{
    public static void main(String[] args) {
        
    
        Scanner sc= new Scanner(System.in);
        int speed=sc.nextInt();
        int time=sc.nextInt();
        int distance=speed*time;
        System.out.println(distance);
    }
}