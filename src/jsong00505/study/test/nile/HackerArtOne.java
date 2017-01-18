package jsong00505.study.test.nile;

import java.util.ArrayList;
import java.util.Arrays;

public class HackerArtOne {
	public static void main(String[] args) {
		int num = 100;
		
		// define list of zero holes 
        ArrayList zeroHoles = new ArrayList(); 
		zeroHoles.add(1);
		zeroHoles.add(2);
        zeroHoles.add(3);
        zeroHoles.add(5);
        zeroHoles.add(7);
        
        // define list of one hole 
        ArrayList oneHoles = new ArrayList(); 
        oneHoles.add(0);
        oneHoles.add(4);
        oneHoles.add(6);
        oneHoles.add(9);
        
        // define list of two holes 
        ArrayList twoHoles = new ArrayList(); 
        twoHoles.add(8);
        
        // 
        int digitPosition = 10;
        int tempNum = num;
        int tempOneDigit = 0;
        int sum = 0;

		while(tempNum > 0){
            // get the last digit of the num
            tempOneDigit = tempNum % 10;
            if(zeroHoles.contains(tempOneDigit)) {
                // zero means nothing, but I declare this for sure
                tempNum /= 10;
            } else if(oneHoles.contains(tempOneDigit)) {
                sum += 1;
                tempNum /= 10;
            } else if(twoHoles.contains(tempOneDigit)) {
                sum += 2;
                tempNum /= 10;
            }
        }
	}
}
