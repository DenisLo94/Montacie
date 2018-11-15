package atelier07;

import java.util.GregorianCalendar;
import util.Keyboard;

public class exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar calendar = new GregorianCalendar();

		temps(calendar);
		Keyboard.getLigne("wait");
		temps(calendar);

	}

	public static void temps(GregorianCalendar calendar) {
		System.out.println(calendar.getTime().toString());

		// print out a bunch of interesting things
		System.out.println("ERA: " + calendar.get(GregorianCalendar.ERA));
		System.out.println("YEAR: " + calendar.get(GregorianCalendar.YEAR));
		System.out.println("MONTH: " + calendar.get(GregorianCalendar.MONTH));
		System.out.println("WEEK_OF_YEAR: "
				+ calendar.get(GregorianCalendar.WEEK_OF_YEAR));
		System.out.println("WEEK_OF_MONTH: "
				+ calendar.get(GregorianCalendar.WEEK_OF_MONTH));
		System.out.println("DATE: " + calendar.get(GregorianCalendar.DATE));
		System.out.println("DAY_OF_MONTH: "
				+ calendar.get(GregorianCalendar.DAY_OF_MONTH));
		System.out
				.println("DAY_OF_YEAR: " + calendar.get(GregorianCalendar.DAY_OF_YEAR));
		System.out
				.println("DAY_OF_WEEK: " + calendar.get(GregorianCalendar.DAY_OF_WEEK));
		System.out.println("DAY_OF_WEEK_IN_MONTH: "
				+ calendar.get(GregorianCalendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("AM_PM: " + calendar.get(GregorianCalendar.AM_PM));
		System.out.println("HOUR: " + calendar.get(GregorianCalendar.HOUR));
		System.out
				.println("HOUR_OF_DAY: " + calendar.get(GregorianCalendar.HOUR_OF_DAY));
		System.out.println("MINUTE: " + calendar.get(GregorianCalendar.MINUTE));
		System.out.println("SECOND: " + calendar.get(GregorianCalendar.SECOND));
		System.out
				.println("MILLISECOND: " + calendar.get(GregorianCalendar.MILLISECOND));
		System.out.println("ZONE_OFFSET: "
				+ (calendar.get(GregorianCalendar.ZONE_OFFSET) / (60 * 60 * 1000)));
		System.out.println("DST_OFFSET: "
				+ (calendar.get(GregorianCalendar.DST_OFFSET) / (60 * 60 * 1000)));

	}
}
