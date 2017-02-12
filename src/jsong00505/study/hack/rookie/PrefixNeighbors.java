package jsong00505.study.hack.rookie;

import java.util.ArrayList;
import java.util.Scanner;

public class PrefixNeighbors {
	public static void main(String[] args) {
		System.out.println((int)'A');
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> A = new ArrayList<>();
		ArrayList<String> B = new ArrayList<>();
		ArrayList<String> C = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			
			if(A.indexOf(s) > -1) {
				
			} else {
				A.add(s);
			}
			
			System.out.println(s);
		}
	}
}
