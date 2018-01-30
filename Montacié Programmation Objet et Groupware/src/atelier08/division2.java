package atelier08;

public class division2 {

	public static void main(String[] args) {
		int i = 1000, j;
		do {
			i--;
			try {
				j = 1 / i;
			} catch (ArithmeticException e) {
				System.out.println("Exception capturée");
			}
		} while (true);
	}

}
