package cours08;

import java.io.*;
import util.Keyboard;

/**
 * @author montacie
 */
public class testParcoursArbreSax {

	public static void main(String[] args) {
		File fxml = new File("xml/article.xml");
		FileInputStream isxml = null;
		try {
			isxml = new FileInputStream(fxml);
		} catch (IOException e) {
		}

		ParcoursArbreSax ges = new ParcoursArbreSax(isxml);
	}

}