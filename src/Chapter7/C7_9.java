package Chapter7;

import java.util.Scanner;

/**
 * Program to find the smallest value in an array
 *
 * @author Stephen Key
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        double[] nums = new double[10];
        System.out.print("First you need to enter ten numbers\n");
        int x;
        for (x = 0; x < nums.length; ++x) {
            System.out.printf("#%d: ", x + 1);
            nums[x] = Input.nextDouble();
        }
        findMin(nums);
    }

    /**
     * Method to search an array for its smallest value
     *
     * @param ary the array being searched
     */
    public static void findMin(double[] ary) {
        int x;
        double min = ary[0];
        for (x = 1; x < ary.length; ++x) {
            if (ary[x] < min) {
                min = ary[x];
            }
        }
        System.out.printf("\nThe smallest value in this array is %.2f", min);
    }
}
