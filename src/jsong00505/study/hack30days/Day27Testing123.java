package jsong00505.study.hack30days;

import java.util.ArrayList;
import java.util.Random;
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
		
        Random rand = new Random();
        ArrayList<String> result = new ArrayList<>();
        
		int numberOfTestCases = rand.nextInt(5);
		System.out.println(numberOfTestCases);
		
		for(int i = 0; i < numberOfTestCases; i++) {
			int totalStudent = rand.nextInt(200);
			int expectedOnTimeStudent = rand.nextInt(totalStudent);
			int countOnTimeStudent = 0;
			System.out.println(totalStudent + " " + expectedOnTimeStudent);
			for(int j = 0; j < totalStudent; j++) {
				int arrivedTime = rand.nextInt(2000) - 1000;
				System.out.print(arrivedTime + " ");
				if(arrivedTime > 0) {
					countOnTimeStudent++;
				}
			}
			System.out.print("\n");
			if(expectedOnTimeStudent > countOnTimeStudent) {
				result.add("YES");
			} else {
				result.add("NO");
			}
		}
		
/*		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println(result.get(i));
		}*/
    }
}
