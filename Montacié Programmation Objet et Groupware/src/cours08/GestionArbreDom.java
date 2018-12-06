package cours08;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class GestionArbreDom {

	Document document = null;

	public GestionArbreDom(InputStream isXml) {
		// création d'une instance d'API DOM
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		// création d'un objet de construction
		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
		}

		// parcours et construction de l'arbre
		try {
			document = builder.parse(isXml);
		} catch (IOException e) {
		} catch (SAXException e) {
		}
	}

	/** Parcours complet de l'arbre */
	public void ParcoursArbre() {
		if (document != null)
			ParcoursArbre(document);
	}

	/**
	 * Exploration récursive d'un noeud de l'arbre
	 * 
	 * @param node
	 *            noeud
	 */
	private void ParcoursArbre(Node node) {
		int type = node.getNodeType();
		switch (type) {
		case Node.DOCUMENT_NODE: {
			System.out.println("début du document:");
			ParcoursArbre(((Document) node).getDocumentElement());
			System.out.println("fin du document:");
			break;
		}

		case Node.TEXT_NODE: {
			String st = node.getNodeValue().trim();
			if (st.length() > 0)
				System.out.println(st);
			break;
		}
		case Node.ELEMENT_NODE: {
			System.out.print("balise de début: " + node.getNodeName());
			// attributs
			NamedNodeMap attrs = node.getAttributes();
			for (int i = 0; i < attrs.getLength(); i++) {
				Node attr = attrs.item(i);
				// nom
				System.out.print(" " + attr.getNodeName() + "=\"");
				// valeur
				System.out.print(attr.getNodeValue() + "\"");
			}
			System.out.println();
			NodeList children = node.getChildNodes();
			if (children != null) {
				int len = children.getLength();
				for (int i = 0; i < len; i++)
					ParcoursArbre(children.item(i));
			}
			System.out.println("balise de fin: " + node.getNodeName());
			break;
		}
		}
	}

}
