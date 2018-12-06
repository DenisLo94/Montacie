package atelier10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MonPremierFichierTexte {
	
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
	
		} 
		catch (FileNotFoundException e) { e.printStackTrace(); }

	}

}
