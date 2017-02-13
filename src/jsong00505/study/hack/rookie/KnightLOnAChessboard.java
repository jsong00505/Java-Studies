package jsong00505.study.hack.rookie;

import java.util.HashMap;
import java.util.Scanner;

public class KnightLOnAChessboard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// count (1,1) ~ (n-1, n-1), so that would be from 2 to (n - 1) *2
		int goal = (n - 1 ) * 2;

		int board[][] = new int[n - 1][n - 1];
		
		for(int i = 1; i < n; i++) {
			for(int j = 1; j < n; j++) {
				if(goal % (i + j) == 0) {
					// If goal is divisible by a+b, the quotient is minimum number of the path
					board[i - 1][j - 1] = goal / (i + j);
				} else {
					/*
					 * case 1. 2a
					 * case 2. 2b
					 * one of both would be the minimum. if not divisible by 2a or 2b, there is no minimum number
					 * 
					 */
					int min = -1;
					
					if(goal % (2 * i) == 0) {
						min = goal / (2 * i);
					}
					
					if((goal % (2 * j) == 0) && min > (goal / (2 * j))) {
						min = goal / (2 * j);
					}
					
					board[i - 1][j - 1] = (min != -1) ? min * 2 : -1;
				}
			}
			
		}
		System.out.println("goal : " + goal);

		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - 1; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}


