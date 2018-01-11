package Chapter4;
import java.util.Scanner;
/**
 * Program to display the information of an employee
 *
 * @author Stephen Key
 */
public class C4_23 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the employee's name.");
        String name = Input.nextLine();
        System.out.println("Enter the number of hours he/she has worked in a week.");
        float hours = Input.nextFloat();
        System.out.println("Enter the employee's hourly payrate.");
        float rate = Input.nextFloat();
        System.out.println("Enter the federal tax withholding rate.");
        float fedRate = Input.nextFloat();
        System.out.println("Enter the federal tax withholding rate.");
        float stateRate = Input.nextFloat();
        System.out.println("Emplayee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: " + rate);
        float gross = hours * rate;
        System.out.printf("Gross Pay: $%.2f\n", gross);
        System.out.println("Deductions");
        float fedTax = gross * fedRate;
        float stateTax = gross * stateRate;
        System.out.printf("    Federal Tax: $%.2f\n", fedTax);
        System.out.printf("    State Tax: $%.2f\n", stateTax);
        System.out.printf("Total Deduction: $%.2f\n",(stateTax + fedTax));
        System.out.printf("Net Pay: $%.2f\n", (gross - (stateTax + fedTax)));
        }
}
