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
public class A7Q1 {

    /**
     *
     * @param radius the radius of the circle
     * @return the area
     */
    public static double circleA(double radius) {
        double area = Math.pow(radius, 2);
        area = area * Math.PI;
        return area;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle.");
        double radius = in.nextDouble();
        double area = circleA(radius);
        System.out.println("The area is " + area);
    }
}
