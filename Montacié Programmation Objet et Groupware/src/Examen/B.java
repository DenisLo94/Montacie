package Examen;
public class B extends A {
	static String a_initialiser = "diego"; // à remplacer par le prénom de l'étudiant

	B(char b, char c, int m) {
		super(b, c, m);
		for (int i = 0; i < n; i++)
			a_initialiser += d[i];
	}

	public void m1(int m) {
		for (int i = 0; i < n; i++) {
			System.out.println(d[i]); } 
	}

	public static void main(String[] args) {
		B b = new B('h', a_initialiser.charAt(2), 6);
		b.m1(2);
		b.m2(5);
	}
}
