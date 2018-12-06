package cours08;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ParcoursArbreSax extends DefaultHandler {

	public ParcoursArbreSax(InputStream isXml) {
		super();
		// création d'une instance d'API SAX
		SAXParserFactory factory = SAXParserFactory.newInstance();
		factory.setValidating(true);

		// création d'un objet de parcours
		SAXParser saxParser = null;
		try {
			saxParser = factory.newSAXParser();
		} catch (SAXException e) {
		} catch (ParserConfigurationException e) {
		}

		// parcours utilisant le gestionnaire d'événement de this
		try {
			saxParser.parse(isXml, this);
		} catch (IOException e) {
		} catch (SAXException e) {
		}
	}

	public void startElement(String namespaceURI, String sName, String qName, Attributes attrs) throws SAXException {

		String eName = sName;
		if ("".equals(eName))
			eName = qName;
		System.out.print("balise de début: ");
		System.out.print(eName);
		if (attrs != null) {
			// attributs
			for (int i = 0; i < attrs.getLength(); i++) {
				String aName = attrs.getLocalName(i);
				if ("".equals(aName))
					aName = attrs.getQName(i);
				// nom
				System.out.print(" " + aName + "=\"");
				// valeur
				System.out.print(attrs.getValue(i) + "\"");
			}
		}
		System.out.println("");
	}

	public void endElement(String namespaceURI, String sName, String qName) throws SAXException {
		String eName = sName;
		if ("".equals(eName))
			eName = qName;
		System.out.println("balise de fin: " + eName);
	}

	public void characters(char buf[], int offset, int len) throws SAXException {
		String s = new String(buf, offset, len);
		String st = s.trim();
		if (st.length() > 0)
			System.out.println(st);
	}

	public void startDocument() throws SAXException {
		System.out.println("début du document:");
	}

	public void endDocument() throws SAXException {
		System.out.println("fin du document:");
	}
}
