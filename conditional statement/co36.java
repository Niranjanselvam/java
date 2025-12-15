
import java.util.Scanner;

//Write a Java Program for an arithmetic calculator using switch case.
public class co36
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        System.out.println("choose an operation:+ - * / %");
        char operator=sc.next().charAt(0);
        double result;
        switch(operator)
        {
            case '+':
                 result=a+b;
                System.out.println(result);
                break;
            case '-':
                 result=a-b;
                System.out.println(result);
                break;
            case '*':
                 result=a*b;
                System.out.println(result);
                break;
            case '/':
                if(b!=0)
                {
                      result=a/b;
                     System.out.println(result);
                }
                else
                {
                    System.out.println("invalid");
                }
                case '%':
                    if(b!=0)
                    {
                         result=a%b;
                        System.out.println(result);
                    }
                    else
                    {
                        System.out.println("invalid");
                    }
                 default:
                    System.out.println("invalid");          

        }
    }
}