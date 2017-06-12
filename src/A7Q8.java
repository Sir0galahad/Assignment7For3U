
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author millc9988
 */
public class A7Q8 {

    public static void season(int month, int day) {
        if (month == 12 && day >= 16) {
            System.out.println("The season is winter.");
        }
        if (month < 3) {
            System.out.println("The season is winter.");
        }
        if (month == 3 && day <= 15) {
            System.out.println("The season is winter.");
        }
        if (month == 3 && day >= 16) {
            System.out.println("The season is spring.");
        }
        if (month < 6 && month > 3) {
            System.out.println("The season is spring.");
        }
        if (month == 6 && day <= 15) {
            System.out.println("The season is spring.");
        }
        if (month == 6 && day >= 16) {
            System.out.println("The season is summer.");
        }
        if (month < 9 && month > 6) {
            System.out.println("The season is summer.");
        }
        if (month == 9 && day <= 15) {
            System.out.println("The season is summer.");
        }
        if (month == 9 && day >= 16) {
            System.out.println("The season is fall.");
        }
        if (month < 12 && month > 9) {
            System.out.println("The season is fall.");
        }
        if (month == 12 && day <= 15) {
            System.out.println("The season is fall.");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the month?");
        int month = in.nextInt();
        System.out.println("What is the day?");
        int day = in.nextInt();
        season(month, day);
    }
}
