package atelier05;

public class Promotion {
	private String annee, formation;
	private String ufr, universite;

	public Promotion(String a, String f, String ufr, String u) {
		annee = a;
		f = formation;
		this.ufr = ufr;
		universite = u;
	}

	/*
	 * accesseur en lecture
	 */
	public String annee() {
		return annee;
	}

	public String formation() {
		return formation;
	}

	public String ufr() {
		return ufr;
	}

	public String universite() {
		return universite;
	}
}
