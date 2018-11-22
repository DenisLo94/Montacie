package atelier08;

public class TroisDes {
	private int[] des;
	private Aleat[] ades;
	private static int ndes = 3; // nombre de des
	private static int vdes = 6; // valeurs d'un dés

	public TroisDes() {
		des = new int[ndes];
		ades = new Aleat[ndes];
		for (int i = 0; i < ndes; i++) {
			ades[i] = new Aleat(vdes);
		}
	}

	public int ndes() {
		return ndes;
	}

	public int get(int i) {
		return get(i);
	}

	public int put(int i, int val) {
		if ((val < 1) || (val > 6))
			return 0;
		des[i] = val;
		return val;
	}

	public TroisDes lancerDes() {
		for (int i = 0; i < ndes; i++)
			this.put(i, ades[i].get());
		return this;
	}

}
