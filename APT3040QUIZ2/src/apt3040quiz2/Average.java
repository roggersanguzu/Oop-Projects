package apt3040quiz2;
import java.util.Scanner;

/**
 *
 * @author ~Roggers Anguzu
 */
public class Average {
    private int[] marks;
    private double average;

    public Average(int size) {
        this.marks = new int[size];
    }

    public void capture() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks for " + marks.length + " students:");
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = input.nextInt();
            sum += marks[i];
        }
        average = (double) sum / marks.length;
    }

    public void displayMarksAndDeviation() {
        System.out.println("\nMarks and their deviation from average:");
        System.out.printf("Average mark: %.2f%n", average);
        for (int i = 0; i < marks.length; i++) {
            double deviation = marks[i] - average;
            System.out.printf("Student %d: Mark = %d, Deviation = %.2f%n", 
                              i + 1, marks[i], deviation);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many students' marks do you want to enter? ");
        int size = input.nextInt();
        
        Average avg = new Average(size);
        avg.capture();
        avg.displayMarksAndDeviation();
    }
}