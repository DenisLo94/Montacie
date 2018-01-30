package atelier04;

public class Alternative1Max {

	public static void main(String[] args) {

		int p1 = 10, p2 = 12, p3 = 11;
		int p4;

		if (p1 > p2) {
			if (p1 > p3)
				p4 = p1;
			else
				p4 = p3;
		} else {
			if (p2 > p3)
				p4 = p2;
			else
				p4 = p3;
		}
		
		System.out.println(p4);

	}

}
