package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate the total price of a meal
 *
 * @author Stephen Key
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the price of the food.");
        double food = Input.nextDouble();
        System.out.println("Enter the price of the drink.");
        double drink = Input.nextDouble();
        System.out.println("Enter the price of the desert.");
        double des = Input.nextDouble();
        double total = food + drink + des;
        double tax = total * 0.1;
        double tip = total * 0.15;
        System.out.println("The initial price of the meal is $" + total);
        System.out.println("The tax costs $" + tax);
        System.out.println("The tip costs $" + tip);
        System.out.println("The total cost of the meal is $" + (total + tax + tip));

    }
}
