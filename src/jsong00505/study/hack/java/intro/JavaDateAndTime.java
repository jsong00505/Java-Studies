package jsong00505.study.hack.java.intro;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by jsong on 26/02/2017.
 */
public class JavaDateAndTime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();

		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));

		String dayOfWeek = "";
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
			case 1:
				dayOfWeek = "SUNDAY";
				break;
			case 2:
				dayOfWeek = "MONDAY";
				break;
			case 3:
				dayOfWeek = "TUESDAY";
				break;
			case 4:
				dayOfWeek = "WEDNESDAY";
				break;
			case 5:
				dayOfWeek = "THURSDAY";
				break;
			case 6:
				dayOfWeek = "FRIDAY";
				break;
			default:
				dayOfWeek = "SATURDAY";
				break;
		}
		System.out.println(dayOfWeek);

	}
}
