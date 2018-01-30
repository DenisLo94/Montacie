package atelier07;

public class testCercle {


	public static void main(String[] args) {
	Cercle c1 = new Cercle(2);
	System.out.println(c1.perimetre());
	Cercle c2 = new Cercle(3);
	System.out.println(c2.surface());
	
	System.out.println(c1.compareTo(c2));
	System.out.println(c2.compareTo(c1));
	System.out.println(c1.compareTo(c1));
	
	
	}

}
