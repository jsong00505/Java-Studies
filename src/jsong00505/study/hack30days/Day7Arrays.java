package jsong00505.study.hack30days;

import java.util.Scanner;

public class Day7Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        
        StringBuilder rev = new StringBuilder();
        for(int i = n; i > 0; i--) {
        	rev.append(arr[i-1]).append(" ");
        }
        
        System.out.println(rev.toString());
 
    }
}
