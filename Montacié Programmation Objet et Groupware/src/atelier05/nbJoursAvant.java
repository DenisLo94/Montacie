package atelier05;

import cours04.Date;

public class nbJoursAvant {

	public static void main(String[] args) {
		Date aujourdhui = new Date(7, 11, 2019);

		int nbJours = 0;
		Date dt = new Date();
		System.out.print("le nombre de jours avant ");
		dt.Afficher();
		do {
			//dt.Afficher();
			nbJours++;
		    aujourdhui.Incrementer();
		}
		while (dt.CompareTo(aujourdhui));

		System.out.println("= " + nbJours + " jours");

	}

}
