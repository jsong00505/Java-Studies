package jsong00505.study.hack30days;

import java.util.Scanner;

public class Day14Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
  	Difference(int[] a) {
  		elements = a;
  	}
  	
  	public void computeDifference() {
  		for(int i = 0; i < elements.length-1; i++) {
  			for(int j = i; j < elements.length; j++) {
  				int result = Math.abs(elements[i] - elements[j]);
  				
  				if(result > maximumDifference) {
  					maximumDifference = result;
  				}
  			}
  		}
  	}
  	
}