package jsong00505.study.hack.code29;

import java.util.Scanner;

public class MegaprimeNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long first = in.nextLong();
		long last = in.nextLong();
		// your code goes here
		long cnt = 0;
		for(long i = first; i <= last; i++) {
			if(isPrimeNumber(i)) {
				cnt++;
			}
		}
		System.out.print(cnt);
	}

	public static boolean isPrimeNumber(long numb) {
		String stringNumb = Long.toString(numb);

		if(numb == 2) {
			return true;
		}

		if(stringNumb.indexOf("0") > -1) {
			return false;
		}

		if(stringNumb.indexOf("1") > -1) {
			return false;
		}

		if(stringNumb.indexOf("4") > -1) {
			return false;
		}

		if(stringNumb.indexOf("6") > -1) {
			return false;
		}

		if(stringNumb.indexOf("8") > -1) {
			return false;
		}

		if(stringNumb.indexOf("9") > -1) {
			return false;
		}

		if(numb % 5 == 0 && numb > 5) {
			return false;
		}

		if(numb % 2 == 0 || numb == 1) {
			return false;
		}

		for(int i = 3; i <= Math.sqrt(numb); i++) {
			if(numb % i == 0) {
				return false;
			}
		}
		return true;
	}
}
