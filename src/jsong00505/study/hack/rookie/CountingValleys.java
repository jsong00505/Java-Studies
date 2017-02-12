package jsong00505.study.hack.rookie;

import java.util.ArrayList;
import java.util.Scanner;

public class CountingValleys {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// set up
		int N = sc.nextInt();
		sc.nextLine();
		String commands = sc.nextLine();
		boolean isVelly = false;
		int countVelly = 0;
		int seaLevel = 0;

		
		// validation
		if(N != commands.length()) {
			return;
		}
		
		for(char c: commands.toCharArray()) {

			if(c == 'U') {
				seaLevel++;
			} else {
				seaLevel--;
			}
			
			if(seaLevel >= 0) {
				if(isVelly) {
					isVelly = false;
					countVelly++;
				}
			} else {
				isVelly = true;
			}
		}
		
		System.out.println(countVelly);

	}
}
