package javaprogrammesweek2;

import java.util.Scanner;

public class Programme_19_ConvertStringToLowerCase {

public static void main(String[] args) {
    //Scanner declaration for reading input form console
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the uppercase sentence: ");
    String uppercase = scanner.nextLine();
    Programme_19_ConvertStringToLowerCase t = new Programme_19_ConvertStringToLowerCase();
    t.convertStringToLowerCase(uppercase);
    //Closing the scanner object
    scanner.close();

}

    // Convert string the to lower case
    public void convertStringToLowerCase(String str) {
        System.out.println("The Lowercase of the string is = " + str.toLowerCase());
    }
}