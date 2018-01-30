package Chapter7;

import java.util.Scanner;

/**
 * Program to curve the grades of a group of students
 *
 * @author Stephen Key
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the number of students");
        short studentNum = Input.nextShort();
        double[] grades = new double[studentNum];
        int x;
        for (x = 0; x < grades.length; ++x) {
            System.out.printf("Student #%d:", x + 1);
            System.out.println("Enter the students grade");
            grades[x] = Input.nextDouble();
        }
        double max = grades[0];
        for (x = 1; x < (grades.length); ++x) {
            if (grades[x] > max) {
                max = grades[x];
            }
        }
        double curve = 100 - max;
        for (x = 0; x < grades.length; ++x) {
            grades[x] += curve;
        }
        for (x = 0; x < grades.length; ++x) {
            System.out.printf("Student %d's grade is a %s\n", x + 1, letter(grades[x]));
        }
    }

    /**
     * Method to convert score to letter grade
     *
     * @param grd The score entered for one student
     * @return The letter value for that score
     */
    public static String letter(double grd) {
        if (grd >= 90) {
            return "A";
        }
        if (grd >= 80) {
            return "B";
        }
        if (grd >= 70) {
            return "C";
        }
        if (grd >= 60) {
            return "D";
        }
        return "F";
    }
}
