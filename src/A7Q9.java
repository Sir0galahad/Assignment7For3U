
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author millc9988
 */
public class A7Q9 {

    public static void allNumbersOdd(int num) {
        while (num / 10 >= 10 && !((num / 10) % 2 == 0)) {
            num = num / 10;
        }
        if ((num / 10) % 2 == 0) {
            System.out.println("The number has even digits");
        } else {
            System.out.println("The number has no even digits");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the number");
        int num = in.nextInt();
        allNumbersOdd(num);
    }
}
