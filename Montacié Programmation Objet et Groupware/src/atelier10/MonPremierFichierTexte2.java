package atelier10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import util.Keyboard;

public class MonPremierFichierTexte2 {
	
	static String noms[] = {"Nikola Lackovic", "Natalia", "Jughurta Ouali", "GAO Shuai",
			"Zeynab", "BENALI_Malika", "Amina AMARA", "sonia", "Matthieu", 
			"Harmonie Begue", "Benziane", "Abdelhak", "DJILLANI Aouataf",
			"SUN_Chen", "Fintan Herlihy", "Arienna Groves", "Rafael Araujo"};

	public static void main(String[] args) {
		try {
			PrintWriter pr = new PrintWriter(new File("src/atelier10/Nom.txt"));
			for (int i = 0;i < noms.length;i++)
			pr.println(noms[i]);
			pr.close();
			if (verifier(new File("src/atelier10/Nom.txt")) == false) {
				System.out.println("erreur d'ecriture");
			}
	
		} 
		catch (IOException e) { e.printStackTrace(); }

	}
	
	static boolean verifier(File ftxt) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(ftxt));
		for (int i = 0;i < noms.length;i++) {
			if (noms[i].equals(br.readLine()) == false)
				return false;
		}
		return true;
	}

}
