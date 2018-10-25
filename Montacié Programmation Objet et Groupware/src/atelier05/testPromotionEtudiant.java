package atelier05;

public class testPromotionEtudiant {

	public static void main(String[] args) {

		Promotion p = new Promotion("18-19", "Master Langue et Informatique",
				"socio et info", "Sorbonne Université");
		Etudiant e = new Etudiant("COMBES", "MATTHIEU", "2507081233Z",
				28506658, p);

	}

}
