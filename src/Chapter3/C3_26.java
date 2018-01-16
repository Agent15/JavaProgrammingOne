package Chapter3;

import java.util.Scanner;

/**
 * Program to determine if a number is divisible by 5 and/or 6
 *
 * @author Stephen Key
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter an integer to be broken down.");
        int num = Input.nextInt();
        if (num % 5 == 0 || num % 6 == 0) {
            System.out.println(num + " is divisible by 5 or 6");
            if (num % 5 == 0 && num % 6 == 0) {
                System.out.print(num + " is divisible by 5 and 6 ");
            } else {
                System.out.println("but not both");
            }
        } else {
            System.out.println(num + " is not divisible by 5 or 6");
        }
    }

}
