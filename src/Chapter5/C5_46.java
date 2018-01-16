package Chapter5;

import java.util.Scanner;

/**
 * Program to reverse the order of a string
 *
 * @author Stephen Key
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int x;
        System.out.println("Enter a string for me to display reverse");
        String message = Input.nextLine();
        String egassem = "";
        for (x = 1; x <= message.length(); ++x) {
            egassem += (message.charAt(message.length() - x));
        }
        System.out.println(egassem);
    }
}
