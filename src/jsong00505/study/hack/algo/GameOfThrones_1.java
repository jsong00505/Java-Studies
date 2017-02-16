package jsong00505.study.hack.algo;

import java.util.HashMap;
import java.util.Scanner;

public class GameOfThrones_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inputString = sc.nextLine();
		
		HashMap<Character, Integer> resMap = new HashMap<>();
		int countOddNumber = 0;
		boolean isPalindrome = true;
		
		for(char c: inputString.toCharArray()) {
			if(resMap.containsKey(c)) {
				resMap.put(c, resMap.get(c) + 1);
			} else {
				resMap.put(c, 1);
			}
		}
		

		for(int i: resMap.values()) {
			if(i % 2 == 1) {
				countOddNumber++;
			}
			
			if(countOddNumber == 2) {
				isPalindrome = false;
			}
		}
		
		System.out.println(isPalindrome?"YES":"NO");
		
		sc.close();
	}
}
