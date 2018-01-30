package atelier07;

public class testGregorianCalender2 {

	public static void main(String[] args) {
		GregorianCalendar2 gc2 = new GregorianCalendar2();
		gc2.creation();
	//	gc2.afficher();
		gc2.duree();
		//temporisation();
		gc2.creation();
		//gc2.afficher();
		gc2.duree();
	}

	/** fonction de temporisation */
	public static void temporisation() {

		float x = 1;
		for (int i = 0; i < 20; i++)
			for (int j = 0; j < 20; j++) {
				for (int k = 0; k < 20; k++) {
					x = x * x;
				}
			}
	}

}
