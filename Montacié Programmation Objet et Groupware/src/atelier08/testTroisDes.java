package atelier08;

public class testTroisDes {

	public static void main(String[] args) {

		TroisDes td = new TroisDes();
		for (int j = 0; j < 10; j++) {
			td.lancerDes();

			for (int i = 0; i < td.ndes(); i++)
				System.out.print(td.get(i));

		}
	}

}
