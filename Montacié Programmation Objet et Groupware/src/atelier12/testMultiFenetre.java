package atelier12;

public class testMultiFenetre {

	public static void main(String[] args) {
	

		MultiFenetre mf = new MultiFenetre(2);
		mf.afficherdoc("livres/avare.txt",0);
		mf.affichertxt("livres/adolphe.txt",1);
	}

}
