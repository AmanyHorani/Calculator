package com.amany;

// Calculator Project (Completed)

// 1. Going over a plan
// 2. You try on your own

        /*
         1. Plan:
         It should ask for two numbers
         It should ask for a math operation (+, -, *, /)
         Display the result
         Loop back to the start o the program where we ask for numbers
         */

// 2. Trying by my own

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter two numbers: ");
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            System.out.print("Enter a math operation (+, -, *, /): ");
            String operation = input.next();

            int result = 0;

            switch (operation) {
                case "+":
                    result = number1 + number2;
                    System.out.println("Result: " + result);
                    break;
                case "-":
                    result = number1 - number2;
                    System.out.println("Result: " + result);
                    break;
                case "*":
                    result = number1 * number2;
                    System.out.println("Result: " + result);
                    break;
                case "/":
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("You must enter one of the following math operations (+, -, *, /)");
            }
        } while (true);
    }
}
