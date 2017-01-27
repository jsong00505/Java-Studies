package jsong00505.study.hack30days;

import java.util.Scanner;

/**
 * Created by jsong on 27/01/2017.
 */
public class Day9Recursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numb = scan.nextInt();

        System.out.println(factorial(numb));


    }

    static int factorial(int numb) {
        if(numb == 1) {
            return 1;
        } else if(numb == 2) {
            return 2;
        } else if(numb > 2) {
            return numb * factorial(numb-1);
        } else {
            return -1;
        }
    }
}
