package atelier04;

public class BranchementConditionnel {

	public static void main(String[] args) {
		int p1 = 10, p2 = 9, p3 = -1;
		int p4;

		if (p1 < p2) {
			if (p2 < p3)
				p4 = p3;
			else
				p4 = p2;
		} else if (p1 < p3)
			p4 = p3;
		else
			p4 = p1;

		System.out.println(p4);

	}
}
