
package cours07;

import java.io.IOException;

import javax.swing.*;

public class testVisualisation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Raccord de m�thode auto-g�n�r�
		
		JEditorPane output = new JEditorPane();
		output.setContentType( "text/html" );
		output.setEditable( false );
		String str = "http://www.paris4.sorbonne.fr/";
		try {
		output.setPage( str);
		} catch (IOException e) {}

		JFrame fen = new JFrame(str);
		fen.setSize(800, 600);
		fen.getContentPane().add(output);
		fen.getContentPane().add(new JScrollPane(output));
		fen.setVisible(true);

	}

}
