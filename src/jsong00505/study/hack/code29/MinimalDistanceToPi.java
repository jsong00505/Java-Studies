package jsong00505.study.hack.code29;

import java.util.Scanner;

public class MinimalDistanceToPi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*        long min = in.nextLong();
        long max = in.nextLong();*/
        // your code goes here
        
        long min = 1;
        long max = 10;
        double minimalDistance = -1;
        long denominator = -1;
        long numerator = -1;
        for(long i = min; i <= max; i++) {
        	long nextOfNumberThree = i * 3 + 1;
        	System.out.println(Math.abs(nextOfNumberThree/(double)i - Math.PI));
        	if(Math.abs(nextOfNumberThree/(double)i - Math.PI) < minimalDistance || minimalDistance == -1) {
        		minimalDistance = Math.abs(nextOfNumberThree/i - Math.PI);
        		
        		numerator = nextOfNumberThree;
        		denominator = i;
        	}
        }
        System.out.println(numerator+"/"+denominator);
    }
}
