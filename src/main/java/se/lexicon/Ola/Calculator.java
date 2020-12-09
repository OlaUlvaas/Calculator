package se.lexicon.Ola;

/**
 * Calculator
 *
 */
import java.util.Scanner;
public class Calculator
{
    public static void main( String[] args )
    {
        meny();
        Scanner scanner = new Scanner(System.in);
        double operation = scanner.nextDouble();
        double result = 0;

        if(operation == 1)
        {
            add();
        }
        else if(operation == 2)
        {
            sub();
        }
        else if(operation == 3)
        {
            mul();
        }
        else if(operation == 4)
        {
            div();
        }
        else if(operation == 5)
        {
            mod();
        }

        scanner.close();
    }
    public static void meny()
    {
    System.out.println( "************CALCULATOR*************" );
    System.out.println( "*\t\t 1. Addition              *" );
    System.out.println( "*\t\t 2. Subtraction           *" );
    System.out.println( "*\t\t 3. Multiplication        *" );
    System.out.println( "*\t\t 4. Division              *" );
    System.out.println( "*\t\t 5. Modulo                *" );
    System.out.println( "*\t\t 9. Quit                  *" );
    System.out.println( "************CALCULATOR*************" );
    }
    public static void add()
    {
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        result += scanner.nextDouble();
        System.out.println("Enter one more number: ");
        result += scanner.nextDouble();
        System.out.println("Do you want to enter another number?: ");
        System.out.println("1. YES: ");
        System.out.println("2. NO: ");
        double keepGoing = scanner.nextDouble();

        while(keepGoing == 1){
            System.out.println("Enter one more number: ");
            result += scanner.nextDouble();
            System.out.println("Do you want to enter another number?: ");
            System.out.println("1. YES: ");
            System.out.println("2. NO: ");
            double whatToDo = scanner.nextDouble();
            if(whatToDo == 2){
                System.out.println("The result from the addition is: " + result);
                break;
            }
        }
        if(keepGoing == 2){
            System.out.println("The result from the addition is: " + result);

        }
    scanner.close();
    }

    public static void sub()
    {
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        result += scanner.nextDouble();
        System.out.println("Enter one more number: ");
        result -= scanner.nextDouble();
        System.out.println("Do you want to enter another number?: ");
        System.out.println("1. YES: ");
        System.out.println("2. NO: ");
        double keepGoing = scanner.nextDouble();

        while(keepGoing == 1){
            System.out.println("Enter one more number: ");
            result -= scanner.nextDouble();
            System.out.println("Do you want to enter another number?: ");
            System.out.println("1. YES: ");
            System.out.println("2. NO: ");
            double whatToDo = scanner.nextDouble();
            if(whatToDo == 2){
                System.out.println("The result from the subtraction is: " + result);
                break;
            }
        }
        if(keepGoing == 2){
            System.out.println("The result from the subtraction is: " + result);

        }
        scanner.close();
    }

    public static void mul()
    {
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        result += scanner.nextDouble();
        System.out.println("Enter one more number: ");
        result *= scanner.nextDouble();
        System.out.println("The result from the multiplication is: " + result);

        scanner.close();
    }
    public static void div()
    {
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        result += scanner.nextDouble();
        System.out.println("Enter one more number: ");
        double denominator = scanner.nextDouble();

        if(denominator == 0){
            System.out.println("NO NO NO - Absolutely forbidden!");
        }
        else{
            result /= denominator;
            System.out.println("The result from the division is: " + result);
        }
        scanner.close();
    }
    public static void mod()
    {
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        result += scanner.nextDouble();
        System.out.println("Enter one more number: ");
        double denominator = scanner.nextDouble();

        if(denominator == 0){
            System.out.println("NO NO NO - Absolutely forbidden!");
        }
        else{
            result %= denominator;
            System.out.println("The result from the modulo division is: " + result);
        }
        scanner.close();
    }
}
