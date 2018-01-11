package Chapter2;
import java.util.Scanner;
/**
 * Program to convert a temperature from celsius to fahrenheit
 *
 * @author Stephen Key
 */
public class C2_1 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the temp in celcius");
        double Celcius = Input.nextDouble();
        double Farenhit = Celcius * (9.0 / 5) + 32;
        System.out.println("It is " + Farenhit + " degrees fahrenheit");
        
    }
}
