
package cours08;


public class testRequeteGet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Etablissement de la connexion
		RequeteGet p = new RequeteGet("www.paris4.sorbonne.fr", 80);
		// Envoi de la requ�te et lecture de la r�ponse
		p.Get("/e-cursus/C2i/index.htm", "www.paris4.sorbonne.fr", "cours09/index.htm");
		// fermeture de la connexion
		p.fin(); 

	}

}
