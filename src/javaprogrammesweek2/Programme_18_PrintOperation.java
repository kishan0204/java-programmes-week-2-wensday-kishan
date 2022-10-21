package javaprogrammesweek2;

import java.util.Scanner;

/**
 * Write a java program print the sum (addition), multiply, subtract, divide and remainder of two number
 * Test data:
 * Input first number :125
 * Input second number :24
 * Expected output:
 * 125 + 24 =149
 * 125 - 24 =101
 * 125 * 24 =3000
 * 125 / 24 =5
 */

public class Programme_18_PrintOperation {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number");
        int secondNumber = scanner.nextInt();
        Programme_18_PrintOperation printOperation = new Programme_18_PrintOperation();
        printOperation.printTheOperation(firstNumber, secondNumber);
        //Closing the scanner object
        scanner.close();
    }

    //Printing the all operations
    public void printTheOperation(int a, int b) {
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
        System.out.println("The difference of " + a + " and " + b + " is " + (a - b));
        System.out.println("The product of " + a + " and " + b + " is " + (a * b));
        System.out.println("The division of " + a + " and " + b + " is " + (a / b));
        System.out.println("The remainder of " + a + " and " + b + " is " + (a % b));
    }
}