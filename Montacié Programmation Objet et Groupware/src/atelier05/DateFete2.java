package atelier05;

public class DateFete2 {

	/** point d'entrée d'un exécutable */
	public static void main(String[] args) {
		// Instanciation de deux objets de type date
		Date today = new Date(2, 11, 2017);
		Date dfin = new Date(14, 7, 2018);

		int nbJours = 0;

		do {
			nbJours++;
			today.Incrementer();
		} while (today.CompareTo(dfin));

		System.out
				.println("Le nombre de jours avant le 14 juillet 2016 est égal à "
						+ nbJours);

	}
}

