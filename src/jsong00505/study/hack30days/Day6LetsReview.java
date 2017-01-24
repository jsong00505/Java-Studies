package jsong00505.study.hack30days;

import java.util.Scanner;

public class Day6LetsReview {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	int T = scan.nextInt();
    	
    	scan.nextLine();
    	for(int i = 0; i < T; i++) {
    		String S = scan.nextLine();
    		StringBuilder even = new StringBuilder();
    	    StringBuilder odd = new StringBuilder();
    		for(int j = 0; j < S.length(); j++) {
    			if(j % 2 == 0) {
    				even.append(S.charAt(j));
    			} else {
    				odd.append(S.charAt(j));
    			}
    		}
    		
    		System.out.println(even + " " + odd);
    	}
    }
}
