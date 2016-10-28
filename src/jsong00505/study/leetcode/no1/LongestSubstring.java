package jsong00505.study.leetcode.no1;

import java.util.HashMap;

public class LongestSubstring {
	public static void main(String[] args) {
		String s = "wobgrovw";
		System.out.println("longest: " + lengthOfLongestSubstring(s));
	}
	// 51.78 %
    public static int lengthOfLongestSubstring(String s) {
    	int longest = 0;
    	int innerLongest = 0;
    	HashMap<String, Integer> tempHm = new HashMap<>();
    	for(int i=0;i<s.length();i++) {
    		if(!tempHm.containsKey(s.substring(i,i+1))) {
    			tempHm.put(s.substring(i, i+1), i);
    			innerLongest++;

    		}else {
    			int temp = tempHm.get(s.substring(i, i+1));
    			if((i - temp) <= innerLongest) {
        			innerLongest = i - tempHm.get(s.substring(i, i+1));
        			tempHm.put(s.substring(i, i+1), i);
    			} else {
    				tempHm.put(s.substring(i, i+1), i);
    				innerLongest++;
    			}
    		}
			if(longest < innerLongest) {
				longest = innerLongest;
			}
    	}
		return longest;
        
    }
}