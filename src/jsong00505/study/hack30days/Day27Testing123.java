package jsong00505.study.hack30days;

import java.util.Scanner;

public class Day27Testing123 {
/*
 * SMAPLE INPUT
 * 2
 * 4 3
 * -1 -3 4 2
 * 5 2
 * 0 -1 2 1 4
 */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
		
		int numberOfTestCases = sc.nextInt();
		
		for(int i = 0; i < numberOfTestCases; i++) {
			int totalStudent = sc.nextInt();
			int expectedOnTimeStudent = sc.nextInt();
			int countOnTimeStudent = 0;
			for(int j = 0; j < totalStudent; j++) {
				if(sc.nextInt() > 0) {
					countOnTimeStudent++;
				}
			}
			
			if(expectedOnTimeStudent > countOnTimeStudent) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
    }
}
