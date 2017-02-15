package jsong00505.study.hack.algo;

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			for(int j = N-1-i; j > 0; j--) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < i+1; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
