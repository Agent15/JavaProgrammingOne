package Chapter4;

import java.util.Scanner;

/**
 * Program to compare two bids
 *
 * @author Stephen Key
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the name of the first bidder.");
        String b1 = Input.next();
        System.out.println("Enter how many hours of work this bidder will require");
        double h1 = Input.nextDouble();
        System.out.println("Enter the amount that this bidder charges per hour.");
        double c1 = Input.nextDouble();
        System.out.println("Enter the name of the second bidder.");
        String b2 = Input.next();
        System.out.println("Enter how many hours of work this bidder will require");
        double h2 = Input.nextInt();
        System.out.println("Enter the amount that this bidder charges per hour.");
        double c2 = Input.nextDouble();
        double cost1 = h1 * c1, cost2 = h2 * c2;
        if (cost1 < cost2) {
            System.out.printf("\nThe winner is %s with a total cost of $%.2f and %.1f hour(s)", b1, cost1, h1);
        }
        if (cost1 > cost2) {
            System.out.printf("The winner is %s with a total cost of $%.2f and %.1f hour(s)", b2, cost2, h2);
        }
        if (cost1 == cost2) {
            if (h1 == h2) {
                System.out.printf("Both %s and %s are matched with the exact same bids.", b1, b2);
                System.out.printf("\n   %.1f hour(s) for $%.2f an hour", h1, c1);
            } else {
                System.out.print("The bidders are matched with different values that even out in the end.");
                System.out.printf("\n   %s bids %.1f hour(s) for $%.2f an hour making $%.2f", b1, h1, c1, cost1);
                System.out.printf("\n   %s bids %.1f hour(s) for $%.2f an hour making $%.2f", b2, h2, c2, cost2);
            }
        }
        System.out.print("\n");
    }
}
