package recursiveFunction;

import java.util.Scanner;

public class StringReverseUsingRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any String :");
        String str = scanner.nextLine();
        System.out.println("The reverse of the String is : " + recursiveReverse(str));
    }

    static String recursiveReverse(String input) {
        System.out.println("input : " + input);
        System.out.println("input.length() : " + input.length());
        if ((input == null) || (input.length() <= 1))
            return input;
        else {
            System.out.println("input.substring(1) : " + input.substring(1));
            System.out.println("input.charAt(0) : " + input.charAt(0));
            return recursiveReverse(input.substring(1)) + input.charAt(0);
        }
    }
}
