package Chapter4;
import java.util.Scanner;
/**
 * Program to determine the grade and major of a student
 *
 * @author Stephen Key
 */
public class C4_18 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter your two characters");
        String total = Input.next();
        char major = total.charAt(0);
        char year = total.charAt(1);
        if (major == 'M')
        {
            switch (year) 
            {
                case '1':
                    System.out.println("Mathematics Freshman");break;
                case '2':
                    System.out.println("Mathematics Sophmore");break;
                case '3':
                    System.out.println("Mathematics Junior");break;
                case '4':
                    System.out.println("Mathematics Senior");break;
                default:System.out.println("Invalid input");break;
            }
        }
        else if (major == 'C')
        {
            switch (year)
            {
                case '1':
                    System.out.println("Computer Science Freshman");break;
                case '2':
                    System.out.println("Computer Science Sophmore");break;
                case '3':
                    System.out.println("Computer Science Junior");break;
                case '4':
                    System.out.println("Computer Science Senior");break;
                default:System.out.println("Invalid input");break;
            }
        }
        else if (major == 'I')
        {
            switch (year) 
            {
                case '1':
                    System.out.println("Information Technology Freshman");break;
                case '2':
                    System.out.println("Information Technology Sophmore");break;
                case '3':
                    System.out.println("Information Technology Junior");break;
                case '4':
                    System.out.println("Information Technology Senior");break;
                default:System.out.println("Invalid input");break;
            }
        }
        else System.out.println("Invalid input");
    }
}
