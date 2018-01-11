package Chapter3;
import java.util.Scanner;
/**\
 * Program to evaluate multiple qualities of two numbers
 *
 * @author Stephen Key
 */
public class P3 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter  a number");
        double n1 = Input.nextDouble();
        System.out.println("Enter another number");
        double n2 = Input.nextDouble();
        if(n1 > n2)
            System.out.println("The first number is greater than the second.");
        if(n1 < n2)
            System.out.println("The first number is less than the second.");
        if(n1 == n2)
            System.out.println("The first number is equal to the second.");
        if(n1 <= n2)
            System.out.println("The first number is less than or equal to the second.");
        if(n1 != n2)
            System.out.println("The first number is not equal to the second.");
        if(n2 == 0)
            System.out.println("Can't divide by zero.");
        else if (n1 / n2 < 1)
                System.out.println("The numbers form a proper fraction.");
        else if (n1 / n2 > 1)
                System.out.println("The numbers form an improper fraction.");
        if(n1 >= 90)
            System.out.println("The first number is an A.");
        else if(n1 >= 80)
            System.out.println("The first number is a B.");
        else if(n1 >= 70)
            System.out.println("The first number is a C.");
        else if(n1 >= 60)
            System.out.println("The first number is a D.");
        else System.out.println("The first number is a F.");
        if(n2 >= 1 && n2 <= 100)
            System.out.println("The second number is in range");
        else System.out.println("The second n umber is out of range");
    }
}
