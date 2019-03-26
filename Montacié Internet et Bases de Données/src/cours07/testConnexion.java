package cours07;

import java.net.*;
import java.io.*;

public class testConnexion {


	static public void main(String[] args) {
		try {
			URI uri = new URI("http://www.paris4.sorbonne.fr/");
			URLConnection cn = uri.toURL().openConnection();
			Reader lecteur = new InputStreamReader(cn.getInputStream());
			BufferedReader tmp = new BufferedReader(lecteur);

			String str;
			while ((str = tmp.readLine()) != null)
				System.out.println(str);
			} catch (IOException e) {}
			catch (URISyntaxException e) {}
		}
}

