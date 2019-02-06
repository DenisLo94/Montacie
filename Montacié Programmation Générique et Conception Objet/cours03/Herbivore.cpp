/*
 * Herbivore.cpp
 *
 * Created on 16 mars 2006, 19:12
 */

#include "Herbivore.h"

/** Cr�ation d'une nouvelle instance de la classe Herbivore
 * @param type esp�ce de Herbivore
 */
Herbivore::Herbivore(string type, int pattes, bool r) : Animal (type, pattes) {
	ruminant = r;
}
    
/** pr�sentation des caract�ristiques de l'herbivore */
void Herbivore::presente() {
	Animal::presente();
    cout << "j'aime les l�gumes";
    if (ruminant == true) cout << " et je rumine";
    else cout << " et je ne rumine pas"; 
    cout << endl;    
}
