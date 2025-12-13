//program to print welcome
/* import java.util.Scanner;
public class Main{
public static void main(String [] args)
{
    System.out.println("Welcome");
}
} */

//program to print the given word
/*import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(str);
    }
}*/
//program to print string
/*import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str);
    }
}
*/
//program to print integer
/*import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a);
    }
}
*/
//program to print fractional number
/*import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        System.out.println(a);
    }
    
}
*/
// Write a Java Program to print the given fractional number in 2-digit decimal format.
/* import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        System.out.printf("%.2f",a);
    }
} */

//  Write a Java Program to print the given integer number in hexadecimal format.
 /* import java.util.Scanner;
 public class Main
 {                                                                          //????????
     public static void main(String [] args)
     {
         Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
        System.out.printf("hexadecimal:%X",a);
    }
} */
//Q8. Write a Java Program to print the given integer number in octal format.
/* import java.util.Scanner;
public class Main{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
         System.out.println("octal: " + Integer.toOctalString(a));
    }
    
} */
//Q9. Write a Java Program to print the given hexadecimal number in integer format.
/* import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hex = sc.next();               
        int value = Integer.parseInt(hex, 16); 

        System.out.println("int: " + value);
    }
}
 */
//Q10. Write a Java Program to print the given octal number in integer format.
/* import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String octal = sc.next();               
        int value = Integer.parseInt(octal, 8); 

        System.out.println("int: " + value);
    }
} */
//Q11. Write a Java Program to print the ASCII value of a character.
/* import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
         ch = sc.next().charAt(0);   

        int ascii = (int) ch;            

        System.out.println("ASCII value: " + ascii);
    } 
}*/
//Q12. Write a Java Program to print the character for the given ASCII value.
/* import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ascii=sc.nextInt();
        char ch=(char)ascii;
        System.out.println(ch);
    }
}
 */
//Q13. Print two numbers with a space
/* import java.util.Scanner;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + " " + b);
    }
} */
//Q14. Print two numbers with a tab
/* import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + "\t" + b);
    }
} */
//Q15. Write a Java Program to print two numbers in two lines.
/* import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
    }
} */
//print a character in single quotes
/* import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println("'" + ch + "'");
    }
} */
// Print two words in double quotes
/* import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w1 = sc.next();
        String w2 = sc.next();
        System.out.println("\"" + w1 + " " + w2 + "\"");
    }
} */
// Print date of birth DD/MM/YYYY
/* import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dd = sc.next();
        String mm = sc.next();
        String yyyy = sc.next();
        System.out.println(dd + "/" + mm + "/" + yyyy);
    }
} */
//Print an integer with + sign
/* import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("+" + num);
    }
} */
//Q21. Print roll number and name

/* import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll = sc.nextInt();
        sc.nextLine(); 
        String name = sc.nextLine();
        System.out.println("Roll No: " + roll + ", Name: " + name);
    }
} */
//Q22. Print marks in 5 subjects

/* import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
    }
} */
//Print your blood group

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bg = sc.next();
        System.out.println("Blood Group: " + bg);
    }
}