package jsong00505.study.hack30days;

import java.util.Scanner;

public class Day1DataTypes {
	public static void main(String[] args) {
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
		Scanner scan = new Scanner(System.in);
	    /* Declare second integer, double, and String variables. */
	    int i_prime = scan.nextInt();
	    double d_prime = scan.nextDouble();
	    scan.nextLine();
	    String s_prime = scan.nextLine();
	    /* Read and save an integer, double, and String to your variables.*/
	    // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

	    /* Print the sum of both integer variables on a new line. */
	    System.out.println(i+i_prime);
	    /* Print the sum of the double variables on a new line. */
		System.out.println(d+d_prime);
	    /* Concatenate and print the String variables on a new line; 
	    	the 's' variable above should be printed first. */
	    System.out.println(s+s_prime);
	}

}
