package atelier05;

import cours04.Date;

public class nbJoursDepuis {

	public static void main(String[] args) {
		Date aujourdhui = new Date(7, 11, 2019);

		int nbJours = 0;
		Date dt = new Date();
		System.out.print("le nombre de jours depuis ");
		dt.Afficher();
		do {
			//dt.Afficher();
			nbJours++;
		    dt.Incrementer();
		}
		while (dt.CompareTo(aujourdhui));

		System.out.println("= " + nbJours + " jours");

	}

}
