package se.lexicon.Ola;

/**
 * Calculator - You can calculate mathematics operation like addition,
 * subtraction, multiplication, division and modulo division.
 * And ofcourse you can not divide buy zero.
 *
 */

import java.util.Scanner;
public class Calculator {
    public static void meny() {
        System.out.println("************CALCULATOR*************");
        System.out.println("*\t\t 1. Addition              *");
        System.out.println("*\t\t 2. Subtraction           *");
        System.out.println("*\t\t 3. Multiplication        *");
        System.out.println("*\t\t 4. Division              *");
        System.out.println("*\t\t 5. Modulo                *");
        System.out.println("*\t\t 9. Quit                  *");
        System.out.println("************CALCULATOR*************");
    }


    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        char operation;
        double denominator, result;
        boolean on = true;

        do{
            meny();
            System.out.println("Specify the type of calculation: ");
            operation = scanner.next().charAt(0);
            switch (operation)
            {
                case '1' : System.out.println("Enter the first number: ");
                    result = scanner.nextDouble();
                    System.out.println("Enter the second number: ");
                    result += scanner.nextDouble();
                    System.out.println("The result of the addition is: " + result);
                    break;
                case '2' : System.out.println("Enter the first number: ");
                    result = scanner.nextDouble();
                    System.out.println("Enter the second number: ");
                    result -= scanner.nextDouble();
                    System.out.println("The result of the subtraction is: " + result);
                    break;
                case '3' : System.out.println("Enter the first number: ");
                    result = scanner.nextDouble();
                    System.out.println("Enter the second number: ");
                    result *= scanner.nextDouble();
                    System.out.println("The result of the multiplication is: " + result);
                    break;
                case '4' : System.out.println("Enter the first number: ");
                    result = scanner.nextDouble();
                    System.out.println("Enter the second number: ");
                    denominator = scanner.nextDouble();
                    if(denominator == 0) {
                        System.out.println("NO NO NO - This is absolutely forbidden.");
                        System.out.println("You are NOT allowed to divide with zero!");
                    }else{
                        result = result / denominator;
                        System.out.println("The result of the division is: " + result);
                    }
                    break;
                case '5' : System.out.println("Enter the first number: ");
                    result = scanner.nextDouble();
                    System.out.println("Enter the second number: ");
                    denominator = scanner.nextDouble();
                    if(denominator == 0) {
                        System.out.println("NO NO NO - This is absolutely forbidden.");
                        System.out.println("You are NOT allowed to divide with zero!");
                    }else{
                        result = result % denominator;
                        System.out.println("The result of the modulo division is: " + result);
                    }
                    break;
                case '9' : System.out.println("Calculator is turned off.");
                    on = false;
                    break;

                default : System.out.println("This is NOT an alternative.");
                    break;
            }
        }while(on);

    }
}