package atelier05;

public class testCarafe {


	public static void main(String[] args) {
		// Création des deux carafes (7 litres et 4 litres)
		Carafe c1 = new Carafe(7), c2 = new Carafe(4);
		
		c1.afficher(); c2.afficher();
		c2.remplir();
		c1.afficher(); c2.afficher();
		c2.transvaser(c1);
		c1.afficher(); c2.afficher();
		
	

	}

}
