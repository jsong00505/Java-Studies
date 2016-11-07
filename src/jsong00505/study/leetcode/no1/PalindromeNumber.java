package jsong00505.study.leetcode.no1;

import jsong00505.core.utils.ReverseString;

public class PalindromeNumber {
	/*
	 * 
	 * key point: parsing and reversing
	 * 
	 * beats 36.34% of java submissions.
	 *  
	 */
    public static boolean isPalindrome(int x) {
    	if(x < 0) {
    		return false;
    	}else if(x == 0) {
    		return true;
    	}else {
    		String numStr = Integer.toString(x);
    		int middle = numStr.length() / 2;
    		
    		if(numStr.length() == 1) {
    			return true;
    		}
    		
			String reverse = ReverseString.reverseString(numStr.substring(0, middle));
			
    		if(numStr.length() % 2 == 0 && numStr.length() > 0) {
    			// EVEN
    			if(numStr.substring(middle).endsWith(reverse)) {
    				return true;
    			} else {
    				return false;
    			}
    		} else if(numStr.length() % 2 != 0 && numStr.length() > 0) {
    			// ODD
    			if(numStr.substring(middle+1).endsWith(reverse)) {
    				return true;
    			} else {
    				return false;
    			}
    		}
    	}
        return false;
    }
}
