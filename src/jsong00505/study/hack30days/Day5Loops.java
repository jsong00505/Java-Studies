package jsong00505.study.hack30days;

import java.util.Scanner;

public class Day5Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 1; i <= 10; i++) {
        	System.out.println(String.format("%d x %d = %d", n, i, n*i));
        }
    }
}
