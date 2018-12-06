package cours08;

import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.text.PlainDocument;
import java.io.FileReader;
import java.io.IOException;
import java.awt.Container;

public class testJTextArea {

	public static void main(String[] args) {

		PlainDocument pdoc = new PlainDocument();
		String NomFichier = "livres/avare.txt";
		pdoc.putProperty("Titre", NomFichier);

		JTextArea ta = new JTextArea(pdoc);

		try {
			ta.read(new FileReader(NomFichier), null);
		} catch (IOException e) {
		}

		JFrame fen = new JFrame("L’avare");
		fen.setSize(400, 500);
		Container jp = fen.getContentPane();
		jp.add(ta);
		jp.add(new JScrollPane(ta));
		fen.setVisible(true);
	}

}
