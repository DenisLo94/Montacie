package atelier07;

import java.util.GregorianCalendar;
import java.util.Date;

public class testGregorianCalendar {

	public static void main(String[] args) {

		GregorianCalendar gc = new GregorianCalendar();
		Date maintenant = new Date();
		gc.setTime(maintenant);
		System.out.println(maintenant.toString());
		// boucle de temporisation
		float x = 1;
		for (int i = 0; i < 2000; i++)
			for (int j = 0; j < 2000; j++) {
				for (int k = 0; k < 2000; k++) {
				x = x * x;
			}
			}
		System.out.println(maintenant.toString());

	}

}
