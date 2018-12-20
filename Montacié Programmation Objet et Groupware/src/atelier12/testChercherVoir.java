package atelier12;

import javax.swing.text.Document;
import javax.swing.text.BadLocationException;

public class testChercherVoir {

	public static void main(String[] args) {
		MultiFenetre mf = new MultiFenetre(2);
		mf.afficherdoc("livres/avare.txt", 0);
		ChercherVoir(mf, " plus ", 10);

	}

	public static void ChercherVoir(MultiFenetre mf, String s, int taille) {
		Document doc = mf.get(0);
		String Stexte = null;
		try {
			Stexte = doc.getText(0, doc.getLength());
		} catch (BadLocationException e) {
		}

		int idx = 0;
		StringBuffer chercher = new StringBuffer("");
		while ((idx = Stexte.indexOf(s, idx)) != -1) {
			chercher.append(Stexte.substring(idx-taille, idx+taille)+"\n");
			idx += s.length();
		}
		mf.affichertxt(chercher.toString(), 1);

		return;
	}

}
