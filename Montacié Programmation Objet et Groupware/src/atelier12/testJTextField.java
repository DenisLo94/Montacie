package atelier12;

import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.text.PlainDocument;
import java.io.FileReader;
import java.io.IOException;
import java.awt.Container;

public class testJTextField {

	public static void main(String[] args) {

		JTextField tf = new JTextField();
		tf.setText("Claude Montacié");

		JFrame fen = new JFrame("Prénom Nom");
		fen.setSize(400, 500);
		Container jp = fen.getContentPane();
		jp.add(tf);
		fen.setVisible(true);
	}

}
