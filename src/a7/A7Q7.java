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
public class A7Q7 {

    public static int firstDigit(int num) {
        if (num < 0) {
            num = num * -1;
        }
        while (num >= 10) {
            num = num / 10;
            System.out.println(num);
        }
        return num;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number you want the first digit of.");
        int num = in.nextInt();
        System.out.println("The first digit is " + firstDigit(num));
    }
}
