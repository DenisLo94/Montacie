package atelier07;

import java.util.GregorianCalendar;
import java.util.Date;


public class GregorianCalendar2 extends GregorianCalendar {
	private boolean cours;

	public GregorianCalendar2() {
		Date maintenant = new Date();
		this.setTime(maintenant);
		System.out.println(maintenant.toString());
	}

	/** affiche la date et l’heure de la création de l’objet. */
	public void creation() {
	}
	
	/** affiche la date et l’heure courante */
	public void afficher() {
	}
	
	/** affiche le nombre de secondes depuis la création de l’objet */
	public void duree() {
	}
	

}
