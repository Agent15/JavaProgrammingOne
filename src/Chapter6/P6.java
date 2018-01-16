package Chapter6;

import java.util.Scanner;

/**
 * Program to convert dollars to a different currency
 *
 * @author Stephen Key
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("How many euros can you buy with a dollar?");
        double euro = Input.nextDouble();
        System.out.println("How many pounds can you buy with a dollar?");
        double pound = Input.nextDouble();
        System.out.println("How many yen can you buy with a dollar?");
        double yen = Input.nextDouble();
        do {
            System.out.print("Enter a dollar value.\n$");
            double value = Input.nextDouble();
            System.out.println("Would you like to buy euros ('E'), punds ('P') or yen('Y')? ");
            String currency = Input.next();
            if (currency.equals("E") || currency.equals("e")) {
                convert(value, euro);
            } else if (currency.equals("P") || currency.equals("p")) {
                convert(value, pound);
            } else if (currency.equals("Y") || currency.equals("y")) {
                convert(value, yen);
            } else {
                System.out.println("There were some problems. Try again.");
                continue;
            }
            System.out.println("Would you like to make another conversion?'yes' or 'no'");
            String ans = Input.nextLine();
            while (!(ans.equals("yes") || ans.equals("no"))) {
                System.out.println("Tey again. 'yes' or 'no'");
                ans = Input.nextLine();
            }
            if (ans.equals("yes")) {
                continue;
            } else if (ans.equals("no")) {
                break;
            }
        } while (1 != 16);
    }

    /**
     * Method to convert currency and add a transition tax
     *
     * @param val the amount of dollars to be converted
     * @param rate the number multiplied to val in order to create an accurate
     * conversion
     */
    public static void convert(double val, double rate) {
        double charge = (val <= 100) ? .1 : .05;
        double sub = val * rate;
        double total = sub - (sub * charge);
        System.out.printf("You just bought %.2f of that currency", total);
    }
}
