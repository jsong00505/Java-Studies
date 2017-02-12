package jsong00505.study.hack30days;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Day25RunningTimeAndComplexity {
    public static void main(String[] args) {
    	/* Enter your code here. */
        Scanner sc = new Scanner(System.in);
        
        
        // get the number of test cases
        int T = sc.nextInt();
        
        // valid T if T is out of range
        if(T > 30 || T < 1) {
        	return;
        }
        
        /*
         *  scan test cases for the number of test case
         *  1. brute force method 
         */
        ArrayList<Integer> nonePrimeList = new ArrayList<>();
        
        for(int i = 0; i < T; i++) {
        	int n = sc.nextInt();
        	String primeMessage = "Prime";
        	// j cannot be zero because n cannot be divide by zero
        	
        	if((n == 1 || n % 2 == 0) && n != 2) {
        		primeMessage = "Not prime";
        	} else {
            	for(int j = 3; j <= Math.sqrt(n); j++) {
            		if(n % j == 0) {
            			primeMessage = "Not prime";
            			break;
            		}
            	}
        	}
        	System.out.println(primeMessage);
        }
    }
}
