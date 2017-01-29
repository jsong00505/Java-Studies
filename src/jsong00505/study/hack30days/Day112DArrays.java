package jsong00505.study.hack30days;

import java.util.Scanner;

/**
 * Created by jsong on 29/01/2017.
 */
public class Day112DArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int max = -100;
        int sum = -100;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                if(sum > max) {
                    max = sum;
                }
            }
        }

        System.out.println(max);
    }
}
