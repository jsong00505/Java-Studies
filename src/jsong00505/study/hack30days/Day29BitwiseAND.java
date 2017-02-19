package jsong00505.study.hack30days;

import java.util.Scanner;

/**
 * Created by jsong on 19/02/2017.
 */
public class Day29BitwiseAND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int maxK = sc.nextInt();
            int max = 0;
            for(int j = 1; j <= N-1; j++) {
                for(int k = j+1; k <= N; k++) {
                    int temp = j & k;
                    if(temp > max && temp < maxK) {
                        max = temp;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
