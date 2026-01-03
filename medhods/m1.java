/* A method is a subprogram which used in a main program
we can develop methods in 4 ways
   with return type with arguments
   with return type without arguments
   without return type with arguments
   without return type without arguments


main advantage is code reusuability

when we are using methods we need to remember three things
  method declaration
  method definition
  method calling
 */
// implementation  -  with return type with arguments

    //declaration
    /* return_type metho??lock;  //definition
    } */
    //call the method in print statement if it having returntype
    // method_name(datatype argument 1,....,datatype argument n); //calling

    //program
    /* import java.util.Scanner;
    public class Main
    {
        static int factorial(int n)
        {
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            return fact;
        }
        public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            Main m=new Main();
            System.out.println(factorial(5));
        }
    } */




// implementation  -  with return type without arguments

    //declaration
    /* return_type method_name()
    {
        statement - block;  //definition
    } */
    //call the method in print statement if it having returntype
    // method_name(); //calling

    //program
    /* import java.util.Scanner;
    public class Main
    {
       static int factorial()
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            return fact;
        }
        public static void main(String[]args)
        {
            System.out.println(factorial());
        }
    } */





// implementation  -  without return type with arguments

    //declaration
    /* void method_name(datatype argument 1,.....,datatype argument_n)
    {
        statement - block;  //definition
    } */
    //we can directly call the method
    // method_name(datatype argument 1,....,datatype argument n); //calling

    //program 
    /* import java.util.Scanner;
    public class Main
    {
        static void factorial(int n)
        {
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            System.out.println(fact);
        }
        public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            factorial(n);
        }
    }

 */


// implementation  -  without return type without arguments

    //declaration
    /* void method_name()
    {
        statement - block;  //definition
    } */
    //we can directly call the method
    // method_name(); //calling

    //program
/*     import java.util.Scanner;
    public class Main
    {
       static void factorial()
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            System.out.println(fact);
        }
        public static void main(String[]args)
        {
            factorial();
        }
    } */
