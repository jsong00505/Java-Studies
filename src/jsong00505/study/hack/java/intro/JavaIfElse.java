package jsong00505.study.hack.java.intro;

import java.util.Scanner;

/**
 * Created by jsong on 20/02/2017.
 */
public class JavaIfElse {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String ans="";

		/*
		 * 1. n is odd -> Weird
		 * 2. n is even and in the inclusive range of 2 to 5 -> Not Weird
		 * 3. n is even and in the inclusive range of 6 to 20 -> Weird
		 * 4. n is even and greater than 20 -> Not Weird
		 */
		if(n%2==1){
			ans = "Weird";
		}
		else{
			if(n >= 2 && n <= 5) {
				ans = "Not Weird";
			} else if(n >= 6 && n <= 20) {
				ans = "Weird";
			} else if(n > 20) {
				ans = "Not Weird";
			}
		}
		System.out.println(ans);

	}
}
