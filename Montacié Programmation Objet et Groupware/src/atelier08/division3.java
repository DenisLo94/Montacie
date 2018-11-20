package atelier08;

public class division3 {
	public static void main(String[] args) {
		try {
			division();
		} catch (ArithmeticException e) {
			System.out.println("Exception capturée");
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getCause());
		}
	}

	public static void division() throws ArithmeticException {
		int i = 1000, j;
		do {
			i--;
			j = 1 / i;
		} while (true);
	}
}