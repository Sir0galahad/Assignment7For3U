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
public class A7Q5 {

    public static void chaotic(int l) {
        for (int i = 0; i < l; i++) {
            System.out.println("");
            int rn = (int) (Math.random() * (5 - 1 + 1)) + 1;
            for (int q = 0; q < rn; q++) {
                System.out.print("*");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many random lines do you want?");
        int l = in.nextInt();
        chaotic(l);
    }
}
