package atelier09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import util.Keyboard;

public class MonPremierFichiertexte {


	public static void main(String[] args) {
		String noms[] = {"Anaëlle","Diego","Bertille","Denis"};
		
		try {
			File f = new File(Keyboard.getString("Nom du fichier : "));
			PrintWriter pr = new PrintWriter(f);
			for (int i = 0;i < noms.length;i++)
				pr.println(noms[i]);
			pr.close();
			if (verifier(f, noms) == true)
				System.out.println("Ecriture des noms verifie");
		} 
		catch (IOException e) { e.printStackTrace(); }

	}
	
	public static boolean verifier(File f, String[] v) throws IOException  {
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		int i;
		for (i = 0;i < v.length;i++) 
			if ((v[i].equals(br.readLine())) == false) 
					break;
		br.close();
		if (i < v.length) return false;
		return true;
	}

}
