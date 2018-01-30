package atelier07;

import cours04.FigureGeometrique;

public class Cercle extends FigureGeometrique implements Comparable {

	private float rayon;
	
	/** Creation d'un cercle noir
	 * @param rayon rayon du cercle */
	public Cercle(float rayon) {
		super("noir");
		this.rayon = rayon;
	}

	/** Comparaison de deux cercles
	 * @return un entier négatif, zéro, ou un entier positif
	 * si l'attribut this.rayon a une valeur plus petite, égale 
	 * ou plus grande que celui du cercle en parametre
	 */
	public int compareTo(Object arg) {
		float rayon = ((Cercle)arg).rayon;
		if (this.rayon < rayon) return -1;
		if (this.rayon > rayon) return +1;
		return 0;
	}

	/** perimetre du cercle
	 * @return 2*rayon*PI */
	public float perimetre() {
		return (float)Math.PI*rayon*2;
	}

	/** surface du cercle
	 *  @return rayon*rayon*PI  */
	public float surface() {
		return (float)Math.PI*rayon*rayon;
	}

}
