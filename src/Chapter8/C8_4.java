package Chapter8;

import java.util.Arrays;

/**
 * Program sort and display the information of multiple employees
 *
 *
 * @author Stephen Key
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        byte x;
        byte o;
        byte total;
        long[][] empHours = {{Rand(), Rand(), Rand(), Rand(), Rand(), Rand(), Rand(), 0},
        {Rand(), Rand(), Rand(), Rand(), Rand(), Rand(), Rand(), 0},
        {Rand(), Rand(), Rand(), Rand(), Rand(), Rand(), Rand(), 0},
        {Rand(), Rand(), Rand(), Rand(), Rand(), Rand(), Rand(), 0},
        {Rand(), Rand(), Rand(), Rand(), Rand(), Rand(), Rand(), 0},
        {Rand(), Rand(), Rand(), Rand(), Rand(), Rand(), Rand(), 0},
        {Rand(), Rand(), Rand(), Rand(), Rand(), Rand(), Rand(), 0}};
        byte[] totals = new byte[7];
        for (x = 0; x < 7; ++x) {
            total = 0;
            for (o = 0; o < 7; ++o) {
                total += empHours[x][o];
            }
            totals[x] = total;
            empHours[x][7] = total;
        }
        Arrays.sort(totals);
        byte pocket;
        for (x = 0; x < totals.length / 2; ++x) {
            pocket = totals[x];
            totals[x] = totals[totals.length - x - 1];
            totals[totals.length - x - 1] = pocket;
        }

        for (x = 0; x < empHours.length; ++x) {
            for (o = 0; o < empHours.length; ++o) {
                if (empHours[o][7] == totals[x]) {
                    System.out.println("Employee #" + (o + 1));
                    Display(empHours[o]);
                    break;
                }
            }
        }
    }

    /**
     * Method to produce a random number
     *
     * @return a random number
     */
    public static long Rand() {
        return (Math.round(Math.random() * 8 + 1));
    }

    /**
     * Method to display the hours of one employee
     *
     * @param nums a list of hours for one employee
     */
    public static void Display(long[] nums) {
        System.out.println("Sun: " + nums[0]);
        System.out.println("Mon: " + nums[1]);
        System.out.println("Tue: " + nums[2]);
        System.out.println("Wed: " + nums[3]);
        System.out.println("Thu: " + nums[4]);
        System.out.println("Fri: " + nums[5]);
        System.out.println("Sat: " + nums[6]);
        System.out.println("Total: " + nums[7]);
    }
}
