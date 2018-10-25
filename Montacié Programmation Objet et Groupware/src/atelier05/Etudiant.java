package atelier05;

public class Etudiant {
	private String nom, prenom, ine;
	private int dossier;
	private Promotion form;
	
	public Etudiant(String n, String p, String ine, int d, Promotion f) {
		nom = n;
		prenom = p;
		this.ine = ine;
		dossier = d;
		form = f;
	}
	
	/*
	 * accesseur en lecture
	 */
	public String nom() { return nom;}
	public String prenom() { return prenom;}
	public String ine() { return ine;}
	public int dossier() { return dossier;}
	public Promotion form() { return form;}
	
}
