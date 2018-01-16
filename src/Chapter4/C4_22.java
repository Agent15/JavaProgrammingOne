package Chapter4;

import java.util.Scanner;

/**
 * Program to determine if one string is a substring of another string
 *
 * @author Stephen Key
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a string.");
        String s1 = Input.nextLine();
        System.out.println("Enter a smaller string");
        String s2 = Input.nextLine();
        boolean test = s1.contains(s2);
        if (test) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }
}
