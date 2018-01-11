package Chapter2;
import java.util.Scanner;
/**
 * Program to calculate the total amount of money earned
 *
 * @author Stephen Key
 */
public class C2_5 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
        public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the subtotal.");
        double sub = Input.nextDouble();
        System.out.println("Enter the gratuity rate");
        byte gratRate = Input.nextByte();
        double grat = sub * gratRate * 0.01;
        double total = sub + grat;
        System.out.println("The gratuity is $" + grat + ". The total is $" + total + ".");
    }
}
