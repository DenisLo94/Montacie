
 /* Omnivore.cpp
 *
 * Created on 16 mars 2006, 19:12
 */

#include "Omnivore.h"

/** Cr�ation d'une nouvelle instance de la classe Omnivore
 * @param type esp�ce de Omnivore
 */
Omnivore::Omnivore(string type, int pattes) : Carnivore (type, pattes, true), Herbivore(type, pattes, false) {
}
    
/** pr�sentation des caract�ristiques du Omnivore */
void Omnivore::presente() {
    Herbivore::presente();
    Carnivore::presente();
}

void Omnivore::crie() {
    Herbivore::crie();
}
