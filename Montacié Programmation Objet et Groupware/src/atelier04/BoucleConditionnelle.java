package atelier04;

public class BoucleConditionnelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "azerty", s2 = "ytreza";
		int i1 = 0 , i2 = s2.length()-1;
		char c1, c2; boolean flag;
		c1 = s1.charAt(i1); c2 = s2.charAt(i2);
	
		// Boucle (priori)
		while((c1 == c2) && (i1 < s1.length()))
		{
			c1 = s1.charAt(i1); c2 = s2.charAt(i2);
			i1++;
			i2--;
			System.out.println(c1);
			System.out.println(c2);
		}
		if(c1 == c2)
			flag = true;
		else
			flag = false;;
		System.out.println(flag);
		
		
		// Boucle (Posteriori)
		do {
			c1 = s1.charAt(i1); c2 = s2.charAt(i2);
			i1++;
			i2--;
		}
		while((c1 == c2) && (i1 < s1.length()) );
		if(c1 == c2)
			flag = true;
		else
			flag = false;
		System.out.println(flag);

	}

}
