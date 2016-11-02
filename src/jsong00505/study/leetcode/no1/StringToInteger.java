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
	 */
    public static int myAtoi(String str) {
    	int result = 0;
    	CheckStringFormat csf = new CheckStringFormat();
    	try {
    		//str = str.replaceAll("\\s+",""); 
    		str = str.trim();
    		result = Integer.parseInt(str);
    	}catch(NumberFormatException nfe) {
    		if((csf.isAlphaNumericString(str) && !csf.isAlphabeticString(str)) || str.startsWith("-") || str.startsWith("+")) {

    			for(int i=0;i<str.length();i++) {
    				if(csf.isAlphabeticString(""+str.charAt(i))) {
    					try {
    						result = Integer.parseInt(str.substring(0,i));
    					}catch(Exception ie) {
    						System.out.println("E: "+ie);
    					}
    				}
    			}
    			
    		} 
    		System.out.println(nfe);
    	}
        return result;
    }
}
