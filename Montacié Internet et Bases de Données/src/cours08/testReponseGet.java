
package cours08;

public class testReponseGet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Attente de la connexion
		ReponseGet p = new ReponseGet(80);
		// R�ception de la requ�te et envoi de la r�ponse
		p.RGet("cours09/");
		// fermeture de la connexion
		p.fin(); 		

	}

}
