package jsong00505.study.hack30days;

import java.util.Scanner;

interface AdvancedArithmetic{
	   int divisorSum(int n);
}

class Calculator2 implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
}

public class Day19Interfaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator2(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
