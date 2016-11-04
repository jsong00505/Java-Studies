package jsong00505.study.leetcode.no1;

import jsong00505.core.utils.CheckStringFormat;

public class StringToInteger {
	/*
	 * 
	 * Implement atoi to convert a string to an integer.
	 * 
	 * Hint: Carefully consider all possible input cases. 
	 * If you want a challenge, 
	 * please do not see below and ask yourself what are the possible input cases.
	 * 
	 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). 
	 * You are responsible to gather all the input requirements up front.
	 * 
	 * Update (2015-02-10):
	 * The signature of the C++ function had been updated. 
	 * If you still see your function signature accepts a const char * argument,
	 * please click the reload button to reset your code definition.
	 * 
	 * problem1: WHITESPACE
	 * Reference: removing whitespace from strings in java
	 * http://stackoverflow.com/questions/5455794/removing-whitespace-from-strings-in-java
	 * 
	 * problem2: exist non numeric strings in the string with numbers
	 * 
	 * problem3: plus/minus symbol
	 * 
	 * problem4: strip whitespaces
	 * 
	 * problem5: overflow
	 * 
	 * problems: you could see how many errors I faces. *Shake My Head*
	 * I need to fix my whole logic. (03/11/16)
	 * 
	 */
    public static int myAtoi(String str) {
    	int result = 0;
    	CheckStringFormat csf = new CheckStringFormat();
    	try {
    		//str = str.replaceAll("\\s+",""); 
    		str = str.trim();
    		result = Integer.parseInt(str);
    	}catch(NumberFormatException nfe) {
    		if(csf.isAlphabeticString(str)) {
    			result = 0;
    		}else if(csf.isAlphaNumericString(str)) {
        		if(str.startsWith("+") || str.startsWith("-")) {
        			if(csf.isNumericString(str.substring(1))) {
        				if(str.startsWith("+")) {
        					result = 2147483647;
        				} else {
        					result = -2147483648;
        				}
        			}else {
        				for(int i = 1;i<str.length();i++) {
        					if(!csf.isNumericString(""+str.charAt(i))) {
        						result = Integer.parseInt(str.substring(1,i));
        					}
        				}
        			}
        		} else {
        			for(int i = 0;i<str.length();i++) {
    					if(!csf.isNumericString(""+str.charAt(i))) {
    						result = Integer.parseInt(str.substring(0,i));
    					}
    				}
        		}
    		} else if(csf.isNumericString(str)) {
    			result = 2147483647;
    		} 
    	}
        return result;
    }
}
