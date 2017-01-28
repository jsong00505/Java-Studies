package jsong00505.study.hack30days;

import java.util.Scanner;

/**
 * Created by jsong on 27/01/2017.
 */
public class Day10BinaryNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int quotient = n;
        int consecutive = 0;
        int max = 0;

        while(quotient > 0) {
            int remainder = quotient % 2;
            quotient /= 2;

            if(remainder == 1) {
                consecutive++;
            } else {
                consecutive = 0;
            }

            if(max < consecutive) {
                max = consecutive;
            }
        }

        System.out.println(max);
    }
}
