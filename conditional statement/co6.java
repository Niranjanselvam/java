import java.util.Scanner;

public class co6
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        if(day==1)
        {
            System.err.println("monday");
        }
        else if(day==2)
        {
            System.out.println("Tuesday");
        }
        else if(day==3)
        {
            System.out.println("wednesday");
        }else if(day==4)
        {
            System.out.println("thursday");
        }else if(day==5)
        {
            System.out.println("friday");
        }else if(day==6)
        {
            System.out.println("saturday");
        }else if(day==7)
        {
            System.out.println("sunday");
        }
        else
        {
            System.err.println("bye tata");
        }

    }
}