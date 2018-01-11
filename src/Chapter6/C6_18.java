package Chapter6;
import java.util.Scanner;
/**
 * Program to help the user create a valid password
 *
 * @author Stpehen Key
 */
public class C6_18 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        boolean check = false;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a new password");
        System.out.println("Your password must follow 3 rules."
                + "\n-It must be at least 8 characters long"
                + "\n-It must consist of only letters and numbers"
                + "\n-It must have at least two numbers");
        do
        {
        String atmpt = Input.nextLine();
        check = Check(atmpt);
        }while(check == false);
    }
    /**
     * Method to determine if the password is valid
     * 
     * @param word the password entered
     * @return a boolean value that will determine if the do-while loop continues
     */
    public static boolean Check(String word)
    {
        boolean valid = true;
        int digitnum = 0;
        if(word.length() >= 8)
        {
            int x;
            for(x = 0; x < word.length(); ++x)
            {
                if ((Character.getNumericValue(word.charAt(x)) >= 10 && (Character.getNumericValue(word.charAt(x))) <=35)||
                    (Character.getNumericValue(word.charAt(x)) >= 0 && (Character.getNumericValue(word.charAt(x))) <=9))
                {
                    if(Character.getNumericValue(word.charAt(x)) >= 0 && (Character.getNumericValue(word.charAt(x))) <=9)
                        digitnum += 1;
                }
                else valid = false;
            }
            if (digitnum < 2)
                valid = false;
        }
        else valid = false;
        if (valid == true)
        {
            System.out.println("Saved.");
            return true;
        }
        else 
        {
            System.out.println("Impropper password, try again");
            return false;
        }
        
    }
}
