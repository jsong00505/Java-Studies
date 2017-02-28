package jsong00505.study.hack.java.intro;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by jsong on 28/02/2017.
 */
public class JavaCurrencyFormatter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

		String india = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);

		// Write your code here.

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}
