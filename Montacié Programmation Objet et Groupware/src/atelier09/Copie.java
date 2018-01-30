package atelier09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.EOFException;
import java.io.IOException;

import util.Keyboard;

public class Copie {

	public static void main(String[] args) {
		try {
			String rep = "src/atelier09/";
			File fin = new File(rep + Keyboard.getString("Nom du fichier source : "));
			FileInputStream fis = new FileInputStream(fin);
			File fout = new File(rep + Keyboard.getString("Nom du fichier cible : "));
			FileOutputStream fos = new FileOutputStream(fout);
			int mem;
			// lecture d'un octet et detection de fin de fichier
			while ((mem = fis.read()) != -1) 
				// ecriture d'un octet
				fos.write(mem);
			fis.close();
			fos.close();
		}

		catch (EOFException e) {
			System.out.println("Fin de lecture de fichier");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
