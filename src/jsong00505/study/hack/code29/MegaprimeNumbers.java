package jsong00505.study.hack.code29;

import java.util.HashMap;
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
		System.out.println(cnt);
		System.out.print(eratos(first, last));
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

		for(int i = 3; i <= Math.sqrt(numb); i += 2) {
			if(numb % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static long eratos(long first, long last) {
		
		HashMap<Long, Boolean> primeList = new HashMap<>();
		
		primeList.put((long) 1, false);
		primeList.put((long) 2, true);
		
		for(long i = 3; i <= last; i += 2) {
			primeList.put(i, true);
		}
		
		for(long i = 3; i <= last; i += 2) {
			
			if(primeList.get(i)) {
				for(long j = i; j * i <= last; j += 2) {
					primeList.put(j * i, false);
				}
				
				String stringNumb = Long.toString(i);
				
				if(stringNumb.indexOf("0") > -1) {
					primeList.put(i, false);
				}
	
				if(stringNumb.indexOf("1") > -1) {
					primeList.put(i, false);
				}
	
				if(stringNumb.indexOf("4") > -1) {
					primeList.put(i, false);
				}
	
				if(stringNumb.indexOf("6") > -1) {
					primeList.put(i, false);
				}
	
				if(stringNumb.indexOf("8") > -1) {
					primeList.put(i, false);
				}
	
				if(stringNumb.indexOf("9") > -1) {
					primeList.put(i, false);
				}
			}		
			
		}
	

		long start = (first % 2 == 0) ? first + 1 : first;
	
		long cnt = 0;
		
		if(first <= 2) {
			cnt++;
		}
		for(long i = start; i <= last; i += 2) {
			if(primeList.get(i)) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
	public static boolean isBetweenNumbers(long key, long start, long last) {
		if(key >= start && key <= last) {
			return true;
		}
		return false;
	}
}
