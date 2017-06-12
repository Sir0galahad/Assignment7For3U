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
public class A7Q4 {

    public static void compInterest(double p, double i, double y) {
        double end = p * Math.pow((1 + i), y);

        end = Math.round(end);
        System.out.println("your final value is $" + end + " meaning you got $" + (end - p) + " in interest.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your principal, interest rate as a decimal and the number of years you are going to wait.");
        System.out.println("First Principal.");
        double p = in.nextDouble();
        System.out.println("Now interest rate as a decimal IE. 13% per annum = .13.");
        double i = in.nextDouble();
        System.out.println("Now the number of years you are going to wait.");
        double y = in.nextDouble();
        compInterest(p, i, y);

    }
}
