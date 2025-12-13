
import java.util.Scanner;

//1 Character Based Write a Java Program to check whether a character is a vowel or consonant.
public class co21
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
        {
            System.out.println("vowel");
        }
        else{
            System.out.println("consonants");
        }
    }
}