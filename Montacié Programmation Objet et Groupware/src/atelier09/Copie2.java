package atelier09;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import util.Keyboard;

public class Copie2 {

	public static void main(String[] args) {
		try {
			String rep = "src/atelier09/";
			File fin = new File(rep
					+ Keyboard.getString("Nom du fichier source : "));
			FileInputStream fis = new FileInputStream(fin);
			File fout = new File(rep
					+ Keyboard.getString("Nom du fichier cible : "));
			FileOutputStream fos = new FileOutputStream(fout);
			
			// calcul de la taille du fichier et copie
			long taille = fin.length();
			byte mem[] = new byte[(int)taille];
			fis.read(mem);
			fos.write(mem);
			
			fis.close();
			fos.close();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
