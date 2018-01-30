package Chapter7;

import java.util.Scanner;

/**
 * Program to determine if two arrays are strictly identical
 *
 * @author Stephen Key
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int x;

        System.out.println("List1:\nEnter the length");
        int length1 = Input.nextInt();
        int[] L1 = new int[length1];
        System.out.println("Enter list1");
        for (x = 0; x < length1; ++x) {
            System.out.print("#" + (x + 1) + ": ");
            int num = Input.nextInt();
            L1[x] = num;
        }
        System.out.println("List2:\nEnter the length");
        int length2 = Input.nextInt();
        int[] L2 = new int[length2];
        System.out.println("Enter list1");
        for (x = 0; x < length2; ++x) {
            System.out.print("#" + (x + 1) + ": ");
            int num = Input.nextInt();
            if (num != -1) {
                L2[x] = num;
            } else {
                break;
            }
        }
        boolean match = compare(L1, L2);
        if (match == true) {
            System.out.println("The lists are strictly identical");
        } else {
            System.out.println("The lists are not striclty identical");
        }
    }

    /**
     * Method to compare two arrays
     *
     * @param list1 the primary array
     * @param list2 the array being compared to list1
     * @return a condition determining if the arrays are identical
     */
    public static boolean compare(int[] list1, int[] list2) {
        if (list1.length == list2.length) {
            int x;
            for (x = 0; x < list1.length; ++x) {
                if (list1[x] != list2[x]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
