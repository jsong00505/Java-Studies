package jsong00505.study.hack.rookie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinimumAbsoluteDifferenceInAnArray {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList<Integer> posArr = new ArrayList<>();
        ArrayList<Integer> negArr = new ArrayList<>();
        for(int a_i=0; a_i < n; a_i++){
        	
            int a = in.nextInt();
            if(a >= 0) {
            	posArr.add(a);
            } else {
            	negArr.add(a);
            }
            
        }
        // your code goes here
        
        int min = 0;

        if(posArr.size() > 1) {
            Collections.sort(posArr);
            
            for(int i = 0; i < posArr.size()-1; i++) {
            	int absValue = Math.abs(posArr.get(i) - posArr.get(i+1));
            	
            	if(absValue < min || min == 0) {
            		min = absValue;
            		if(min < 1) {
            			break;
            		}
            	}
            }
        }

        if(negArr.size() > 1) {
            Collections.sort(negArr);
            
            for(int i = 0; i < negArr.size()-1; i++) {
            	int absValue = Math.abs(negArr.get(i) - negArr.get(i+1));
            	
            	if(absValue < min || min == 0) {
            		min = absValue;
            		if(min < 1) {
            			break;
            		}
            	}
            }    
        }
        
        if(posArr.size() > 0 && negArr.size() >0) {
        	int posMin = posArr.get(0);
	        int negMax = negArr.get(negArr.size()-1);
	
	        if(min > Math.abs(posMin-negMax) || min == 0) {
	        	min =  Math.abs(posMin-negMax);
	        }
        }

        // NOT PASSED!
        System.out.println(min);
	}
}
