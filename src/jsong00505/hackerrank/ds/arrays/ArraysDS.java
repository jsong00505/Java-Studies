package jsong00505.hackerrank.ds.arrays;

import java.util.Scanner;

public class ArraysDS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        for(int rev = n; rev > 0; rev--) {
        	System.out.print(arr[rev-1]);
        	
        	if(rev != 1) {
        		System.out.print(" ");
        	}
        	
        }
    }
}
