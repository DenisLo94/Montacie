package atelier09;

import java.io.*;
import java.util.*;

/** Lecture des mots d'un fichier-texte
* @author montacie
*/
public class LireTexte {
	
private String NomFichier;
private BufferedReader entrée;
private String ligne;
private StringTokenizer tok;

/** Création d'une nouvelle instance de LireTexte
* @param ft nom du fichier texte
*/
public LireTexte(String ft) {}
/** Ouverture d'un fichier texte,
* Lecture de la première ligne,
* Teste si le fichier est vide
* @throws IOException Erreur à l'ouverture
* @throws FichierVide Fichier vide
*/
protected void Ouvrir() throws IOException, FichierVide {}

/** Fermeture du fichier
* @throws IOException Erreur à la fermeture
*/
protected void Fermer() throws IOException {}


/** Lecture mot à mot du fichier
* @return prochain mot
* @throws IOException Erreur de lecture
*/
public String readWord () throws IOException {}
}