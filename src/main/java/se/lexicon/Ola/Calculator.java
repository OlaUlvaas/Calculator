
package se.lexicon.Ola;


/**
 * Calculator - You can calculate mathematics operation like addition and subtraction multiple times
 * and also calculate multiplication, division and modulo division.
 * And ofcourse you can not divide by zero in the division and the modulo division methods.
 *
 */


import java.util.Scanner;
public class Calculator {
    public static void meny() {
        System.out.println("************CALCULATOR*************");
        System.out.println("*\t\t (+) = Addition              *");
        System.out.println("*\t\t (-) = Subtraction           *");
        System.out.println("*\t\t (*) = Multiplication        *");
        System.out.println("*\t\t (/) = Division              *");
        System.out.println("*\t\t (%) = Modulo                *");
        System.out.println("*\t\t (P) = Power of              *");
        System.out.println("*\t\t (S) = Square root           *");
        System.out.println("*\t\t (Q) = Quit                  *");
        System.out.println("************CALCULATOR*************");
    }


    public static void main(String[] args){
        boolean on = true;


        do{
            Scanner scanner =  new Scanner(System.in);
            char choose;

            meny();
            System.out.println("Specify the type of calculation: ");
            choose = scanner.next().charAt(0);

            if(choose == '+'){
                addition();
            }
            if(choose == '-'){
                subtraction();
            }
            if(choose == '*'){
                multiplication();
            }
            if(choose == '/'){
                division();
            }
            if(choose == '%'){
                modulo();
            }
            if(choose == 'p' || choose == 'P'){
                powerOf();
            }
            if(choose == 's' || choose == 'S') {
                squareRoot();
            }
            //Turn off the Calculator
            if(choose == 'Q' || choose == 'q'){
                System.out.println("Calculator is turned off.");
                on = false;
            }



        }while(on);

    }

    public static double division(){
        double result, denominator;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        result = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        denominator = scanner.nextDouble();
        if(denominator == 0){
            System.out.println("\nNO NO NO - This is absolutely forbidden.");
            System.out.println("You are NOT allowed to divide with zero!\n");
        } else{
            result /= denominator;
            System.out.println("\nThe result of the division is: " + result + "\n");
        }
        return  result;
    }
    public static double modulo(){
        double result, denominator;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        result = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        denominator = scanner.nextDouble();
        if(denominator == 0){
            System.out.println("\nNO NO NO - This is absolutely forbidden.");
            System.out.println("You are NOT allowed to divide with zero!\n");
        } else{
            result %= denominator;
            System.out.println("\nThe result of the division is: " + result + "\n");
        }
        return  result;
    }
    public static int powerOf(){
        int firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base: ");
        firstNumber = scanner.nextInt();
        System.out.println("Enter the exponent: ");
        secondNumber = scanner.nextInt();
        int power = (int) Math.pow(firstNumber, secondNumber);
        System.out.println("\nThe result of the " + secondNumber + " power of " + firstNumber + " is: " +
                power + "\n");
        return power;
    }
    public static double squareRoot(){
        double number, result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number do you want to take the square root of?: ");
        number = scanner.nextInt();

        result = Math.sqrt(number);
        System.out.println("\nThe square root of " + number + " is: " + result + "\n");
        return result;
    }
    public static double addition()
    {
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        result += scanner.nextDouble();
        System.out.println("Enter one more number: ");
        result += scanner.nextDouble();
        System.out.println("Do you want to enter another number?: ");
        System.out.println("Y = YES: ");
        System.out.println("N = NO: ");
        char keepGoing = scanner.next().charAt(0);

        while(keepGoing == 'Y' || keepGoing == 'y'){
            System.out.println("Enter one more number: ");
            result += scanner.nextDouble();
            System.out.println("Do you want to enter another number?: ");
            System.out.println("Y = YES: ");
            System.out.println("N = NO: ");
            char whatToDo = scanner.next().charAt(0);
            if(whatToDo == 'N' || whatToDo == 'n'){
                System.out.println("\nThe result from the addition is: " + result + "\n");
                return result;
            }
        }
        if(keepGoing == 'N' || keepGoing == 'n'){
            System.out.println("\nThe result from the addition is: " + result + "\n");
            return result;
        }
    return result;
    }
    public static double subtraction()
    {
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        result += scanner.nextDouble();
        System.out.println("Enter one more number: ");
        result -= scanner.nextDouble();
        System.out.println("Do you want to enter another number?: ");
        System.out.println("Y = YES: ");
        System.out.println("N = NO: ");
        char keepGoing = scanner.next().charAt(0);

        while(keepGoing == 'Y' || keepGoing == 'y'){
            System.out.println("Enter one more number: ");
            result -= scanner.nextDouble();
            System.out.println("Do you want to enter another number?: ");
            System.out.println("Y = YES: ");
            System.out.println("N = NO: ");
            char whatToDo = scanner.next().charAt(0);
            if(whatToDo == 'N' || whatToDo == 'n'){
                System.out.println("\nThe result from the subtraction is: " + result + "\n");
                return result;
            }
        }
        if(keepGoing == 'N' || keepGoing == 'n'){
            System.out.println("\nThe result from the subtraction is: " + result + "\n");
            return result;
        }
        return result;
    }
        public static double multiplication(){
            double result;
            Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        result = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        result *= scanner.nextDouble();
        System.out.println("\nThe result of the multiplication is: " + result + "\n");
        return result;
    }

}