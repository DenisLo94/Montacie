package cours08;

import javax.swing.JTextPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.io.FileReader;
import java.io.IOException;
import java.text.BreakIterator;
import java.awt.Color;
import java.awt.Container;

public class testJTextPane {

	public static void main(String[] args) {
		String NomFichier = "livres/avare.txt";
		JTextPane tp = new JTextPane();

		// lecture du document
		try {
			tp.read(new FileReader(NomFichier), null);
		} catch (IOException e) {
		}

		// définition du style Personnage
		StyledDocument dsdoc = tp.getStyledDocument();
		dsdoc.putProperty("Titre", "L’avare");
		Style s = dsdoc.addStyle("Personnage", null);
		StyleConstants.setForeground(s, Color.PINK);
		StyleConstants.setFontSize(s, 16);
		StyleConstants.setBold(s, true);

		// enrichissement du texte
		BreakIterator bi1 = BreakIterator.getWordInstance();
		String cc = null;
		try {
			cc = dsdoc.getText(0, dsdoc.getLength());
		} catch (BadLocationException e) {
		}
		bi1.setText(cc);
		int debut = bi1.first();
		for (int fin = bi1.next(); fin != BreakIterator.DONE; debut = fin, fin = bi1.next()) {
			if (cc.substring(debut, fin).matches("[A-Z]*"))
				dsdoc.setCharacterAttributes(debut, fin - debut, s, true);
		}

		// affichage
		JFrame fen = new JFrame("L’avare");
		fen.setSize(400, 500);
		Container jp = fen.getContentPane();
		jp.add(tp);
		jp.add(new JScrollPane(tp));
		fen.setVisible(true);
	}

}
