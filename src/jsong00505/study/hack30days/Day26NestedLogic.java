package jsong00505.study.hack30days;

import java.util.Scanner;

public class Day26NestedLogic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// get user inputs
		String returnedDate = sc.nextLine();
		String expectedDate = sc.nextLine();
		
		// split the date to day, month and year
		String[] splitReturnedDate = returnedDate.split(" ");
		int returnedDay = Integer.parseInt(splitReturnedDate[0]);
		int returnedMonth = Integer.parseInt(splitReturnedDate[1]);
		int returnedYear = Integer.parseInt(splitReturnedDate[2]);
		
		String[] splitExpectedDate = expectedDate.split(" ");
		int expectedDay = Integer.parseInt(splitExpectedDate[0]);
		int expectedMonth = Integer.parseInt(splitExpectedDate[1]);
		int expectedYear = Integer.parseInt(splitExpectedDate[2]);
		

		// check year, month and day
		int fine = 0;
		if(returnedYear < expectedYear) {
			fine = 0;
		} else if(returnedYear != expectedYear) {
			fine = 10000;
		}  else if(returnedMonth < expectedMonth) {
			fine = 0;
		} else if(returnedMonth != expectedMonth) {
			fine = 500 * (returnedMonth - expectedMonth);
		} else if(returnedDay != expectedDay && returnedDay > expectedDay) {
			fine = 15 * (returnedDay - expectedDay);
		}
		
		System.out.println(fine);
	}
}
