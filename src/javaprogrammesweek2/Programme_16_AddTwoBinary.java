package javaprogrammesweek2;
/*Write a java program to add two binary number.
Input Data:
Input first binary number : 10
Input second binary number :11

 */

import java.util.Scanner;

public class Programme_16_AddTwoBinary {
    public static void main(String[] args) {
        System.out.println("Welcom to java program to add two binary number");
        //Scanner declaration foe reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter first binary number");
        String first = scanner.nextLine();
        System.out.println("please enter second binary number");
        String second = scanner.nextLine();
        String addition = addTwoBinaryNumbers(first, second);
        System.out.println("The addition of two binary number is : " + addition);
        //Closing the scanner object
        scanner.close();
    }

    //Adding the two Binary Numbers
    public static String addTwoBinaryNumbers(String first, String second) {
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }


}

