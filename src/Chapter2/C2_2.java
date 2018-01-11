package Chapter2;
import java.util.Scanner;
/**
 * Program to Determine the area of any cylinder
 *
 * @author Stephen Key
 */
public class C2_2 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the radius of a cylinder.");
        double radius = Input.nextDouble();
        System.out.println("Now enter the length.");
        double length = Input.nextDouble();
        double area = radius * length * 3.141592653589;
        System.out.println("The area of the cylinder is" + area + " cubic units.");
    }    
}
