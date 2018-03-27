package cours08;

import java.io.*;
import java.net.*;

public class RequeteGet {
	private BufferedReader from = null;
	private PrintWriter to = null;
	private Socket s;
	
	/** Cr�ation d'un connexion TCP avec le port du SA 
	 * 
	 * @param POP nom du SA
	 * @param port port SA (en g�n�ral 80)
	 */
	public RequeteGet(String POP, int port)
	{
		// cr�ation de la socket
		s = new Socket();
		InetAddress UA = null;
		try {
			UA = InetAddress.getLocalHost();
		}
	    catch (UnknownHostException exp){
		System.out.println("machine inconnue");
		}
		
	    try {
		//	adresse de la machine distante
		InetAddress SA = InetAddress.getByName(POP);
		InetSocketAddress saddr2 = new InetSocketAddress(SA, port);
		
		// demande de connexion
		s.connect(saddr2, 500);
		System.out.println("Connexion �tablie entre " +
				s.getLocalSocketAddress() + " et " +
				s.getRemoteSocketAddress());
	    }
		catch (IOException exp){
			System.out.println("erreur d'ouverture");
			}
	
	// Cr�ation des flots
	try {
	from = new BufferedReader(new InputStreamReader(s.getInputStream()));
	to = new PrintWriter(s.getOutputStream(), true);
	}
	catch (IOException exp){
		System.out.println("erreur de cr�ation des flots");
		}
	}
	
	/** fermeture de la connexion */
	public void fin() {
		try { s.close(); }
		catch( Exception e) {System.out.println("Erreur r�seau");}	
	}
	
	/** Requ�te GET
	 * @param chemin chemin de la ressource
	 * @param host hote du site
	 */
	void Get (String chemin, String host, String fout) {
		String sUA, sSA;
		
		try {
			FileWriter fw = new FileWriter(new File(fout));
			sUA = "GET " + chemin + " HTTP/1.1\r\nHost: " + host + "\r\n";
			System.err.print(sUA + " "); to.println(sUA);
			// lecture de l'ent�te et recherche de la taille du corps
			String tagTaille = "Content-Length: ";
			int taille = 0;
			do {
				sSA = from.readLine(); System.err.println(sSA);
				if (sSA.startsWith(tagTaille) == true) 
					taille = Integer.parseInt(sSA.substring(tagTaille.length()));
			} while (sSA.length() != 0);
			System.err.println("fin de l'ent�te");
			System.err.println("la taille du corps du message est " + taille);
			// lecture du corps et sauvegarde du fichier
			int n = 0; int c;
			do {
				c = from.read(); fw.write(c); n++;
			} while (n < taille);
			fw.close();
		}
		catch (Exception e) {
			System.err.println(e);
		}
	}
	

}
