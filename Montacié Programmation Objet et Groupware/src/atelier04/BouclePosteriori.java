package atelier04;

public class BouclePosteriori {

	public static void main(String[] args) {

		String s1 = "azerty", s2 = "ytreza";
		char c1, c2;
		boolean flag = false;
		
		if (s1.length() == s2.length()) {
			int i1 = 0, i2 = s2.length() - 1;
			do {
				c1 = s1.charAt(i1);
				c2 = s2.charAt(i2);
				if (i1 > i2) {
					flag = true;
					break;
				}
				i1++;
				i2--;
			} while (c1 == c2);
		}

		System.out.println(flag);
	}

}
