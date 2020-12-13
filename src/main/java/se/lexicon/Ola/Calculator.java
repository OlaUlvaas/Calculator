
package se.lexicon.Ola;


/**
 * Calculator - You can calculate mathematics operation like addition,
 * subtraction, multiplication, division, power of, square root and modulo division.
 * And ofcourse you can not divide by zero.
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

        Scanner scanner =  new Scanner(System.in);
        int firstNumber = 0, secondNumber = 0;
        double result, denominator;
        char choose;
        boolean on = true;

        do{
            meny();
            System.out.println("Specify the type of calculation: ");
            choose = scanner.next().charAt(0);
            if(choose == '+'){
                System.out.println("Enter the first number: ");
                result = scanner.nextDouble();
                System.out.println("Enter the second number: ");
                result += scanner.nextDouble();
                System.out.println("\nThe result of the addition is: " + result + "\n");
            }
            if(choose == '-'){
                System.out.println("Enter the first number: ");
                result = scanner.nextDouble();
                System.out.println("Enter the second number: ");
                result -= scanner.nextDouble();
                System.out.println("\nThe result of the subtraction is: " + result + "\n");
            }
           if(choose == '*'){
               System.out.println("Enter the first number: ");
               result = scanner.nextDouble();
               System.out.println("Enter the second number: ");
               result *= scanner.nextDouble();
               System.out.println("\nThe result of the multiplication is: " + result + "\n");

           }
           if(choose == '/'){
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

           }
            if(choose == '%'){
                System.out.println("Enter the first number: ");
                result = scanner.nextDouble();
                System.out.println("Enter the second number: ");
                denominator = scanner.nextDouble();
                if(denominator == 0){
                    System.out.println("NO NO NO - This is absolutely forbidden.");
                    System.out.println("You are NOT allowed to divide with zero!");
                } else {
                    result %= denominator;
                    System.out.println("\nThe result of the modulo division is: " + result + "\n");
                }

            }
            if(choose == 'p' || choose == 'P'){
                System.out.println("Enter the base: ");
                firstNumber = scanner.nextInt();
                System.out.println("Enter the exponent: ");
                secondNumber = scanner.nextInt();
                int power = (int) Math.pow(firstNumber, secondNumber);
                System.out.println("\nThe result of the " + secondNumber + " power of " + firstNumber + " is: " +
                       power + "\n");
            }
            if(choose == 'S' || choose == 's'){
                System.out.println("What number do you want to take the square root of?: ");
                firstNumber = scanner.nextInt();
                result = Math.sqrt(firstNumber);
                System.out.println("\nThe square root of " + firstNumber + " is: " + result + "\n");
            }
            if(choose == 'Q' || choose == 'q'){
                System.out.println("Calculator is turned off.");
                on = false;
            }
            else{

            }


        }while(on);






    }
}

