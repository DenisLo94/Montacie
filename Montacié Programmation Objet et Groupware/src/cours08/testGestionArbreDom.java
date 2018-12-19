package cours08;

import java.io.*;

/**
 * @author montacie
 */
public class testGestionArbreDom {

	public static void main(String[] args) {
		File fxml = new File("livres/hamlet.xml");
		FileInputStream isxml = null;
		try {
			isxml = new FileInputStream(fxml);
		} catch (IOException e) {
		}

		GestionArbreDom ges = new GestionArbreDom(isxml);
		ges.ParcoursArbre();
	}

}
