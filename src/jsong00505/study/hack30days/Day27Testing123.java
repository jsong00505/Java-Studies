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
	Day27Testing123(int n, int k, int[] a){
        System.out.println(n + " " + k);
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // number of test cases - each test case is two lines
        int testCases = 5; 
        
        System.out.println(testCases);
        new Day27Testing123(4, 3, new int[] {-1, 0, 4, 2});
        new Day27Testing123(5, 2, new int[] {0, -1, 2, 1, 4});
        new Day27Testing123(7, 6, new int[] {2, 0, -1, 1 , 1 , 1, 1});
        new Day27Testing123(3, 1, new int[] {-1, 0, 4});
        new Day27Testing123(6, 4, new int[] {0, -1, 1, 4, 5, 6});
    }
/*	public static int rndInt(int min, int max) {
		Random rand = new Random();
		return rand.nextInt((max-min) + 1) + min;
	}
    public static void main(String[] args) {
         Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
		
        Random rand = new Random();
        ArrayList<String> result = new ArrayList<>();
        
		int numberOfTestCases = rndInt(0, 5);
		System.out.println(numberOfTestCases);
		
		for(int i = 0; i < numberOfTestCases; i++) {
			int totalStudent = rndInt(1, 200);
			int expectedOnTimeStudent = rndInt(1, totalStudent);
			int countOnTimeStudent = 0;
			System.out.println(totalStudent + " " + expectedOnTimeStudent);
			for(int j = 0; j < totalStudent; j++) {
				int arrivedTime = rndInt(-10, 10);
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
		
		for(int i = 0; i < numberOfTestCases; i++) {
			System.out.println(result.get(i));
		}
    }*/
}
