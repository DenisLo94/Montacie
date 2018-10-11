package atelier02;

/** @author montacie */

public class B {
	/**
	 * 
	 * @param n
	 * @return n/2 si n multiple de 13 sinon n+2
	 */
	int divise( int n) {
		if (A.treize(n) == true) return n/2; else return n+2;
	}

}
