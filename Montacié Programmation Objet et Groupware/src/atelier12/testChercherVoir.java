package atelier12;

import javax.swing.text.Document;
import javax.swing.text.BadLocationException;

public class testChercherVoir {

	public static void main(String[] args) {
		MultiFenetre mf = new MultiFenetre(2);
		mf.afficherdoc("livres/avare.txt", 0);
		ChercherVoir(mf, "avare", 20);

	}

	public static void ChercherVoir(MultiFenetre mf, String s, int taille) {

		Document doc = mf.get(0);
		String Stexte = null;

		try {
			Stexte = doc.getText(0, doc.getLength());
		} catch (BadLocationException e) {
		}

		int nOcc = 0, idx = 0;
		while ((idx = Stexte.indexOf(s, idx)) != -1) {
			nOcc++;
			mf.affichertxt(Stexte.substring(idx-taille, 2*taille), 1);

			idx += s.length();
		}

		return;
	}

}
