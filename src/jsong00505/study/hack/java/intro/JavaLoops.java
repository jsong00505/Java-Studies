package jsong00505.study.hack.java.intro;

import java.util.Scanner;

public class JavaLoops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + (N * i));
		}
	}
}
