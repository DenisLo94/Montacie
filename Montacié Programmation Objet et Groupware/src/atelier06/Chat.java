/**
 * 
 */
package atelier06;

/**
 * @author isha
 *
 */
public class Chat extends Félin implements Domesticable {
	private String nom;
	private boolean domestique;

	/**
	 * @param type
	 */
	public Chat() {
		super("Chat");
		domestique = false;
	}

	/*
	 * !CodeTemplates.overridecomment.nonjd!
	 * 
	 * @see atelier06.Domesticable#domestiquer(java.lang.String)
	 */
	@Override
	public void domestiquer(String nom) {
		domestique = true;
		this.nom = nom;
	}

	/*
	 * !CodeTemplates.overridecomment.nonjd!
	 * 
	 * @see atelier06.Domesticable#nom()
	 */
	@Override
	public String nom() {
		if (domestique == true)
			return this.nom;
		else
			return null;
	}
	
	public void presente() {
		if (domestique == false)
			super.presente();
		else {
			System.out.println("je suis vraiment un animal domestique");
			System.out.println("et je m'appelle " + nom());
		}
	}
	
	/** cri du félin */
	public void crie() {
		if (domestique == false)
			super.presente();
		else 
		System.out.println("et je miaule");
	}

}
