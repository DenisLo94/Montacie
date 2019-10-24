package atelier04;

public class BoucleConditionnelle {

	public static void main(String[] args) {
		String s1 = "azerty", s2 = "ytreza";
		System.out.println(miroir(s1, s2));
	}

	public static boolean miroir(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		
		int i1 = 0, i2 = s2.length() - 1;
		while (s1.charAt(i1) == s2.charAt(i2)) {
			i1++;
			i2--;
			if (i2 == -1) return true;
		}
		
		return false;
	}

}
