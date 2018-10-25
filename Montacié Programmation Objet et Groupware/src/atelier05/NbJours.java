package atelier05;

import cours04.Date;

public class NbJours {

	public static void main(String[] args) {
		Date fete = new Date(14,7,2019);
		// on entre la date du jour au clavier
		Date aujour = new Date();
		// on calcule le nombre de jours entre les deux dates
		int nbJours=0;
		while (fete.CompareTo(aujour) == false) {
			nbJours++;
			aujour.Incrementer();
		}
		System.out.println("le nombre de jours est " + nbJours);
			
	}

}
