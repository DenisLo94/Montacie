package atelier11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class LireToutUnTexte {
private String Stexte;
/** lecture d'un fichier texte dans la chaîne sTexte
* @param ft descripteur du fichier
*/
public LireToutUnTexte(File ft) {
	String ligne;
	Stexte = "";
	try {
		BufferedReader br = new BufferedReader(new FileReader(ft));
		while ((ligne=br.readLine()) != null) {
			// ligne = ligne.split("\t")[0];
			Stexte += ligne + " ";
		}
		br.close();
	} 
	catch (IOException e) { e.printStackTrace(); }
}

public void Afficher() {
	System.out.println(Stexte);
}

/** Recherche du nombre d'occurences de s dans sTexte
* @param s chaîne cherchée
* @return nombre d'occurences
*/
public int Chercher(String s) {
	return 0;
}


/** Affichage du contexte des occurences de s dans sTexte
* @param s chaîne cherchée
* @param taille taille du contexte
*/
public void ChercherVoir(String s, int taille) {
	return;
}
}