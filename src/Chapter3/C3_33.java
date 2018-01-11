package Chapter3;
import java.util.Scanner;
/**
 * Program to determine which package is a better value
 *
 * @author Stephen Key
 */
public class C3_33 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the weight of the first package");
        byte w1 = Input.nextByte();
        System.out.println("Enter the price of the first package");
        double p1 = Input.nextDouble();
        System.out.println("Enter the weight of the second package");
        byte w2 = Input.nextByte();
        System.out.println("Enter the price of the second package");
        double p2 = Input.nextDouble ();
        double ratio1 = p1 / w1;
        double ratio2 = p2 / w2;
        if(ratio1 < ratio2)
        {
            System.out.println("Package one is better");
        }
        else if(ratio2 < ratio1)
            System.out.println("Package two is better");
        else System.out.println("The packages are the same");
    }
}
