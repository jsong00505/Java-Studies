package jsong00505.study.hack.code29;

import java.util.Scanner;

/**
 * Created by jsong on 20/02/2017.
 */
public class DayOfTheProgrammer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int y = in.nextInt();
		// your code goes here


		int theDay = 13;
		if((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) {
			theDay = 12;
		}

		System.out.println(theDay+".09."+y);

	}

}
