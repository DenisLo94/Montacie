package atelier04;

public class BranchementConditionnel {

	public static void main(String[] args) {
		int p1 = 10, p2 = 9, p3 = -1;

		System.out.println(maximum(p1, p2, p3));
		System.out.println(minimum(p1, p2, p3));

	}

	public static int maximum(int p1, int p2, int p3) {
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

		return p4;
	}

	public static int minimum(int p1, int p2, int p3) {
		int p4;

		if (p1 < p2) {
			if (p1 < p3)
				p4 = p1;
			else
				p4 = p3;
		} else if (p2 < p3)
			p4 = p2;
		else
			p4 = p3;

		return p4;
	}
}
