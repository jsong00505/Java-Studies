package jsong00505.study.hack30days;

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
        
        for(int i = 0; i < T; i++) {
        	long n = sc.nextLong();
        	String primeMessage = "Prime";
        	// j cannot be zero because n cannot be divide by zero
        	// Also, cannot be one because every n's remainder is zero by one
        	// n should be long type because n's maximum is 2*10^9
        	for(long j = 2; j < n; j++) {
        		if(n % j == 0) {
        			primeMessage = "Not prime";
        		}
        	}
        	
        	System.out.println(primeMessage);
        }
        
        
    }
}
