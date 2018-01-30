package atelier08;

public class PileFace {
	Aleat al;

	public PileFace() {
		al = new Aleat(2);
	}
	
	public float simulation(int n) {
		float moyface = 0;
		for (int i = 0;i < n;i++) {
			moyface += al.get();
		}
		return -1 + moyface/n;
	}

}
