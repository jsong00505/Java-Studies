package jsong00505.study.hack.code29;

import java.util.Scanner;

/**
 * Created by jsong on 21/02/2017.
 */
public class BigSorting {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] unsorted = new String[n];
		for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
			unsorted[unsorted_i] = in.next();
		}


		String temp = "";
		// your code goes here
		// do insert sorting
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(unsorted[i].length() < unsorted[j].length()) {
					temp = unsorted[i];
					unsorted[i] = unsorted[j];
					unsorted[j] = temp;
				} else if((unsorted[i].length() == unsorted[j].length()) && (unsorted[i].compareTo(unsorted[j]) > 0)) {
					temp = unsorted[i];
					unsorted[i] = unsorted[j];
					unsorted[j] = temp;
				}
			}
		}

		// print out in order
		for(int i = 0; i < n; i++) {
			System.out.println(unsorted[i]);
		}

	}
}
