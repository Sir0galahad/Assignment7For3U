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
public class A7Q3 {

    public static void factors(int num) {
        int q = 0;
        System.out.println("The factors of " + num + " are: ");
        for (int i = 1; i < num + 1; i++) {
            if ((num % i) == 0 && num / i > 0) {
                System.out.print(num / i + ",  ");
                q++;
            }
        }
        System.out.println("");
        System.out.println("Wow thats " + q + " factors!");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your number.");
        int num = in.nextInt();
        factors(num);
    }
}
