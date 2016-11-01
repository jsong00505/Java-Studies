package jsong00505.study.leetcode.no1;

import java.util.HashMap;

public class RomanToInt {
	
	/*
	 * Given a roman numeral, convert it to an integer.
	 * Input is guaranteed to be within the range from 1 to 3999.
	 * Roman numerals - just bring it from Wikipedia
	 * https://en.wikipedia.org/wiki/Roman_numerals
	 * Symbol | I | V | X  | L  | C   | D   | M
	 * Value  | 1 | 5 | 10 | 50 | 100 | 500 | 1,000
	 * 
	 * A few specific exception cases
	 * Number   | 4  | 9  | 40 | 90 | 400 | 900
	 * Notation | IV | IX | XL | XC | CD  | CM
	 * 
	 * sol1 : just sum everything -> I didn't check exception case above.
	 * sol2 : check everything when the substring is "I", "X" or "C". Those are only 6 cases.
	 * sol3 : save the all case in hashmap.
	 * 
	 * I solved this with sol3, but my runtime beats 0.10% of java submissions. I need to get better one than this.
	 * How shame on me.
	 * 
	 * UPDATE: I found the reason why mind is so slow. In my code, print method was there. I delete it, and mind beats 11.48%.
	 * 		   Unfortunately, 11.48% is still slow...
	 * 
	 * 	
	*/	
	
    public static int romanToInt(String s) {
    	HashMap<String, Integer> romanHashMap = new HashMap<>(); 

   		romanHashMap.put("I", 1);
   		romanHashMap.put("V", 5);
   		romanHashMap.put("X", 10);
   		romanHashMap.put("L", 50);
   		romanHashMap.put("C", 100);
   		romanHashMap.put("D", 500);
   		romanHashMap.put("M", 1000);
   		
   		romanHashMap.put("IV", 4);
   		romanHashMap.put("IX", 9);
   		romanHashMap.put("XL", 40);
   		romanHashMap.put("XC", 90);
   		romanHashMap.put("CD", 400);
   		romanHashMap.put("CM", 900);
   		
    	int sum = 0;
    	String temp = "";
    	for(int i = 0;i<s.length();i++) {

    		if((i+1) == s.length()) {
    			temp = s.substring(i);
    		}else if(romanHashMap.containsKey(s.substring(i, i+2))) {
        		temp = s.substring(i,i+2);
        		i++;
    		} else {
        		temp = s.substring(i,i+1);
    		}
       		sum += romanHashMap.get(temp);
       		System.out.println("SUM" + sum);
       	}
        return sum;
    }
}
