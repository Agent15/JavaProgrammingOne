package Chapter7;

import java.util.Scanner;

/**
 * Program to display the average value in an array and the array itself
 *
 * @author Stephen Key
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int x;
        Scanner Input = new Scanner(System.in);
        System.out.println("How many numbers are you entering?");
        int limit = Input.nextInt();
        int[] nums = new int[limit];
        fill(nums);
        double average = average(nums);
        System.out.println("The average is " + average);
        print(nums);
    }

    /**
     * Method to fill the array
     *
     * @param arr the array that is being filled
     */
    public static void fill(int[] arr) {
        Scanner Input = new Scanner(System.in);
        int x;
        for (x = 0; x < arr.length; ++x) {
            System.out.println("Enter number " + (x + 1));
            int num = Input.nextInt();
            arr[x] = num;
        }
    }

    /**
     * Method to find the average of the array
     *
     * @param arr the array being averaged
     * @return the average value of the array
     */
    public static double average(int[] arr) {
        int x;
        int sum = 0;
        for (x = 0; x < arr.length; ++x) {
            sum += arr[x];
        }
        double average = sum / arr.length;
        return average;
    }

    /**
     * Method to display all of the elements in the array
     *
     * @param arr the array whose elements are being displayed
     */
    public static void print(int[] arr) {
        int x;
        System.out.print("The array is ");
        for (x = 0; x < arr.length; ++x) {
            System.out.print(arr[x] + ", ");
        }
    }
}
