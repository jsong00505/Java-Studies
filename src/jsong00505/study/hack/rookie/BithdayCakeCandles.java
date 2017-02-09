package jsong00505.study.hack.rookie;

import java.util.Scanner;

public class BithdayCakeCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        
        // init the values
        int tallest_height = height[0];
        int number_of_tallest = 0;
        
        // loop for n times
        for(int index = 0; index < n; index++) {
        	/*
        	 * compare height between tallest and present
        	 * case 1. present one is bigger than tallest
        	 * 			1) change the tallest height
        	 * 			2) reset the number of tallest
        	 * case 2. present one is the same height as tallest
        	 * 			1) raise the count of tallest
        	 */
        	if(tallest_height < height[index]) {
        		tallest_height = height[index];
        		number_of_tallest = 1;
        	} else if(tallest_height == height[index]){
        		number_of_tallest++;
        	}
        }
        
        System.out.println(number_of_tallest);
    }
}
