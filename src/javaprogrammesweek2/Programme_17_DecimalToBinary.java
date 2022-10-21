package javaprogrammesweek2;

import java.util.Scanner;

public class Programme_17_DecimalToBinary {
    /**
     * Write a java program to convert a decimal number to binary number.
     * Input Data
     * Input a Decimal number :5
     * Expected Output
     * Binary number is : 101
     */
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        System.out.println("Welcome to java program to convert decimal to binary number");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter decimal number");
        int number = scanner.nextInt();
        convertDecimalToBinary(number);
        //Closing the scanner object
        scanner.close();
    }

    // Converting the decimal to binary
    public static void convertDecimalToBinary(int number) {
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is : " + binary);
    }

}

