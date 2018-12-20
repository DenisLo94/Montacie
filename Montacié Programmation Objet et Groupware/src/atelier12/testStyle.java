package atelier12;

import java.awt.Color;

import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class testStyle {

	public static void main(String[] args) {
		StyleContext sc = new StyleContext();
		Style st1 = sc.addStyle("st1", null);
		StyleConstants.setForeground(st1, Color.BLUE);
		StyleConstants.setFontSize(st1, 22);
		StyleConstants.setItalic(st1, true);
		StyleConstants.setFontFamily(st1, "times");
		
	}

}
