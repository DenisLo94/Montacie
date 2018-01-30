package atelier06;

/** Création et gestion de félins */
public class Félin extends Animal {

	/**
	 * le constructeur de Félins fait appel au constructeur de la sur-classe
	 * Animal
	 */
	public Félin(String type) { // les félins ont 4 pattes
		super(type, 4);
	}

	/** présentation des caractéristiques du félin */
	public void presente() {
		// appel de la méthode de la super-classe
		super.presente();
		System.out.println("je suis vraiment un animal sauvage");
	}

	/** cri du félin */
	public void crie() {
		System.out.println("et je rugis");
	}
}