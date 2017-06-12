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
public class A7Q6 {

    public static int lastDigit(int num) {
        int last = num % 10;
        return last;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your number.");
        int num = in.nextInt();
        System.out.println("The last digit is " + lastDigit(num));

    }
}
