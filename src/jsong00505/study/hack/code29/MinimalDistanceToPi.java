package jsong00505.study.hack.code29;

import java.util.Scanner;

public class MinimalDistanceToPi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*        long min = in.nextLong();
        long max = in.nextLong();*/
        // your code goes here
        
        long min = 1;
        long max = (long) Math.pow(10, 1);
		double minimalDistance = -1;
		long denominator = -1;
		long numerator = -1;
		long minJ = 1;
		for(long i = min; i <= max; i++) {

			long j = minJ;
			double temp = 0;
			while(true) {
				long nextOfNumberThree = i * 3 + j;

				if(temp == 0) {
					temp = Math.abs(nextOfNumberThree/(double)i - Math.PI);
				}

				if(Math.abs(nextOfNumberThree/(double)i - Math.PI) < minimalDistance || minimalDistance == -1) {
					minimalDistance = Math.abs(nextOfNumberThree/(double)i - Math.PI);

					numerator = nextOfNumberThree;
					denominator = i;
					if(i >= 7) {
						minJ = j;
					}

				}

				if(temp >= nextOfNumberThree/(double)i - Math.PI) {
					temp = Math.abs(nextOfNumberThree/(double)i - Math.PI);
					j++;
				} else {
					break;
				}

			}


		}
		System.out.println(numerator+"/"+denominator);
	}
}
