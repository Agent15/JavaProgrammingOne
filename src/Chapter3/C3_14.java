package Chapter3;

import java.util.Scanner;

/**
 * Program to flip a coin and guess the outcome
 *
 * @author Stephen Key
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        byte truCoin = (byte) (Math.random() * 2);
        byte coin;
        Scanner Input = new Scanner(System.in);
        System.out.println("Call it in the air. 'H' or 'T'");
        String call = Input.nextLine();
        System.out.println(call);
        if (call == "H") {
            coin = 1;
        } else if (call == "T") {
            coin = 0;
        } else {
            coin = 2;
        }
        if (coin == truCoin) {
            System.out.println("That's right!");
        } else {
            System.out.println("Nope");
        }
    }

}
