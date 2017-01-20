package jsong00505.study.test.nile;

import java.util.HashMap;

public class ProblemFour {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="ba2";
		String T="2Ad";
		
		System.out.println("RESULT: " + solution(S, T));
	}
	
	public static boolean solution(String S, String T) {
        // check length first
        int lengthS = 0;
        int lengthT = 0;
        
        int pos = 0;
        HashMap<Integer, Character> hmS = new HashMap<>();
        HashMap<Integer, Character> hmT = new HashMap<>();
        String numbers = "01234567890";
        
        
        // check length of S
        for(int i=0;i<S.length();i++) {
            if(numbers.matches(".*"+S.charAt(i)+".*")) {
            	lengthS += Integer.parseInt(""+S.charAt(i));            			
            } else {
            	lengthS++;
            	hmS.put(i, S.charAt(i));
            }
        }
        
        // check length of T
        for(int i=0;i<T.length();i++) {
            if(numbers.matches(".*"+T.charAt(i)+".*")) {
            	lengthT += Integer.parseInt(""+T.charAt(i));            			
            } else {
            	lengthT++;
            	System.out.println(T.charAt(i));
            	hmT.put(i, T.charAt(i));
            }
        }
        
        System.out.println(hmT);
        if(lengthS != lengthT) {
            return false;   
        }
        
        for(int i=0;i<lengthS;i++) {
        	//System.out.println(hmT.get(i) +"," + hmS.get(i));
        	if(hmT.get(i) == null || hmS.get(i) == null) {
        		continue;
        	} else if(!hmT.get(i).equals(hmS.get(i))) {
        		return false;
        	}
        	
        }

        
        return true;

			
	}
	

}
