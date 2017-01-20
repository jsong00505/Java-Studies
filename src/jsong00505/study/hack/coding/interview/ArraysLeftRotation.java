package jsong00505.study.hack.coding.interview;

import java.util.Scanner;

public class ArraysLeftRotation {
    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int[] res = new int[n];
        int pos = k % n;
        
        for(int i = 0; i < n; i++) {
        	res[i] = a[pos];
        	
        	if(pos == (n - 1)) {
        		pos = 0;
        	} else {
        		pos++;
        	}
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
