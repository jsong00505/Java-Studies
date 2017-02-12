package jsong00505.study.hack.rookie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HackerRankInAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int q = sc.nextInt();
		sc.nextLine();
		
		HashMap<String, Boolean> hackerMap = new HashMap<>();
		ArrayList<Character> hackerList;
		for(int i = 0; i < q; i++) {
			hackerList = setHackerRankMap();
			String sentence = sc.nextLine();
			
			for(char c: sentence.toCharArray()) {
				if(c == hackerList.get(0)) {
					hackerList.remove(0);
				}
				
				if(hackerList.size() == 0) {
					break;
				}
			}
			
			if(hackerList.size() == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
	}
	
	public static ArrayList<Character> setHackerRankMap() {
		ArrayList<Character> hackerList = new ArrayList<>();
		String hackerString = "hackerrank";
		for(char c: hackerString.toCharArray()) {
			hackerList.add(c);
		}
		return hackerList;
	}
}
