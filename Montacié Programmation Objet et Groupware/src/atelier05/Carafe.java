package atelier05;

public class Carafe {

	private float contenu_, capacite_;

	/**
	 * Au départ les carafes sont vides.
	 * 
	 * @param c
	 *            capacite de la carafe en litres
	 */
	public Carafe(int c) {
		capacite_ = c;
		contenu_ = 0;

	}

	/** Remplir complétement la carafe */
	public void remplir() {
		contenu_ = capacite_;
	}

	/** Vider complétement la carafe */
	public void vider() {
		contenu_ = 0;
	}

	/**
	 * connaitre le contenu de la carafe
	 * 
	 * @return contenu en litres
	 */
	public float contenu() {
		return contenu_;
	}

	/**
	 * connaitre la capacite de la carafe
	 * 
	 * @return capacite en litres
	 */
	public float capacite() {
		return capacite_;
	}

	/**
	 * transvaser completement la carafe dans une autre
	 * 
	 * @param autreCarafe
	 *            carafe dans laquelle on transvase
	 */
	public void transvaser(Carafe autreCarafe) {
		float reste = autreCarafe.capacite() - autreCarafe.contenu();

		// 1er cas on peut transvaser completement la carafe dans l'autre carafe
		if (reste >= contenu()) {
			autreCarafe.contenu_ += contenu();
			vider();
		} else
		// 2ème cas on ne transvase qu'une partie de la carafe
		{
			autreCarafe.remplir();
			contenu_ -= reste;
		}

	}
	
	public void afficher() {
		System.out.println("["+ capacite() + ", " + contenu()+ "]");
	}

}
