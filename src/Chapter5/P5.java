package Chapter5;
import java.util.Scanner;
/**
 * Program to count the number of votes taken
 *
 * @author Stephen Key
 */
public class P5 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main (String[] args)
    {
        Scanner Input = new Scanner(System.in);
        int yes = 0, no = 0;
        System.out.println("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting");
        char vote = Input.next().charAt(0);
        while(1 == 1)
        {
            if(vote == 'Y' || vote == 'y')
            {
                yes += 1;
                System.out.println("Enter another vote");
            }
            else if(vote == 'N' || vote == 'n')
            {
                no += 1;
                System.out.println("Enter another vote");
            }
            else if(vote == 'Q' || vote == 'q')
            {
                break;
            }
            else
                System.out.println("That's an invalid vote. Try again\n'Y' for yes 'N' for no 'Q' to quit");
            vote = Input.next().charAt(0);
        }
        System.out.println("'Yes' Votes: " + yes + "\n'No' votes:  " + no);
    }
}
