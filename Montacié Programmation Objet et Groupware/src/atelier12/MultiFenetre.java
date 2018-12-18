package atelier12;

import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.io.FileReader;
import java.io.IOException;
import java.awt.Container;
import java.awt.GridLayout;

public class MultiFenetre {
	private JFrame fen; 
	private Container jp;
	private JTextPane fen1, fen2;
	private JPanel pan;
	
	public MultiFenetre() {
		fen = new JFrame("MultiFenetre");
		fen.setSize(400, 500);
		jp = fen.getContentPane();
		pan = new JPanel();
		pan.setLayout(new GridLayout(1,2));
		fen1 = new JTextPane();
		//fen1.add(new JScrollPane(fen1));
		fen2 = new JTextPane();
		pan.add(fen1);
		pan.add(fen2);
		jp.add(pan);	
		
	}

	public void afficher1(String nomFichier) {
		// lecture du document
		try {
			fen1.read(new FileReader(nomFichier), null);
		} catch (IOException e) {
		}
		fen.setVisible(true);

	}
	
	public void afficher2(String nomFichier) {
		// lecture du document
		try {
			fen2.read(new FileReader(nomFichier), null);
		} catch (IOException e) {
		}
		fen.setVisible(true);

	}

}
