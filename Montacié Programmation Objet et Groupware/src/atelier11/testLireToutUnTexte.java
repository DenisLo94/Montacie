package atelier11;

import java.io.File;

public class testLireToutUnTexte {

	public static void main(String[] args) {
		
		File ft = new File("livres/adelaide.txt");
		LireToutUnTexte lt = new LireToutUnTexte(ft);
		lt.Afficher();
		
	}

}
