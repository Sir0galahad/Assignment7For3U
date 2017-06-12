/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a7;

import java.util.Scanner;

/**
 *
 * @author millc9988
 */
public class A7Q2 {

    public static void examGrade(int mark) {
        if (mark < 50) {
            System.out.println("You got an F.");
        }
        if (mark < 59 && mark > 49) {
            System.out.println("You got a D.");
        }
        if (mark < 70 && mark > 59) {
            System.out.println("You got a C.");
        }
        if (mark < 80 && mark > 69) {
            System.out.println("You got a B.");
        }
        if (mark > 79) {
            System.out.println("You got a A.");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What mark did you get in percentage?");
        int mark = in.nextInt();
        examGrade(mark);
    }
}
