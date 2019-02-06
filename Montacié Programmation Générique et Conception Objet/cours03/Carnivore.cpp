
 /* Carnivore.cpp
 *
 * Created on 16 mars 2006, 19:12
 */

#include "Carnivore.h"

/** Cr�ation d'une nouvelle instance de la classe Carnivore
 * @param type esp�ce de carnivore
 */
Carnivore::Carnivore(string type, int pattes, bool d) : Animal (type, pattes) {
	doux = d;
}
    
/** pr�sentation des caract�ristiques du carnivore */
void Carnivore::presente() {
	Animal::presente();
    cout << "j'aime la viande";
    if (doux == false) cout << " et je suis cruel";
    else cout << " et je suis doux"; 
    cout << endl; 
}

