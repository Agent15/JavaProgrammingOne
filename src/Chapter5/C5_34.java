
package Chapter5;
import java.util.Scanner;
/**
 * Program to play rock paper scissors with the computer
 *
 * @author Stephen Key
 */
public class C5_34 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        int p1 = 0;
        int pc = 0;
        char comcall;
        do
        {
            int complan = (int)(Math.random()* 3);
            if(complan == 1)
                comcall = 'R';
            else if (complan == 2)
                comcall = 'P';
            else
                comcall = 'S';
            System.out.println("SHOOT! Enter \"R\" \"P\" or \"S\".");
            String call = Input.next();
            char pcall = call.charAt(0);
            while(!(pcall == 'R' || pcall == 'P' || pcall == 'S'))
            {
                System.out.println("That doesn't count\nTry again, \"R\" \"P\" or \"S\".");
                call = Input.next();
                pcall = call.charAt(0);
            }
            if(pcall == 'R')
            {
                if(comcall == 'R')
                {
                    System.out.println("It's a tie");
                }
                if(comcall == 'P')
                {
                    System.out.println("The computer wins this round.");
                    pc += 1;
                }
                if(comcall == 'S')
                {
                    System.out.println("You win this round.");
                    p1 += 1;
                }
            }
            if(pcall == 'P')
            {
                if(comcall == 'R')
                {
                    System.out.println("You win this round.");
                    p1 += 1;
                }
                if(comcall == 'P')
                {
                    System.out.println("It's a tie");
                }
                if(comcall == 'S')
                {
                    System.out.println("The computer wins this round.");
                    pc += 1;
                }
            }
            if(pcall == 'S')
            {
                if(comcall == 'R')
                {
                    System.out.println("The computer wins this round.");
                    pc += 1;
                }
                if(comcall == 'P')
                {
                    System.out.println("You win this round.");
                    p1 += 1;
                }
                if(comcall == 'S')
                {
                    System.out.println("It's a tie");
                }
            }
        }while(Math.abs(p1-pc) < 2);
        if(p1 > pc)
        {
            System.out.println("YOU WIN!!!");
            System.out.println("Score: " + p1 + "-" + pc);
        }
        if(pc > p1)
        {
            System.out.println("COMPUTER WINS!!!");
            System.out.println("Score: " + p1 + "-" + pc);
        }
    }    

}
