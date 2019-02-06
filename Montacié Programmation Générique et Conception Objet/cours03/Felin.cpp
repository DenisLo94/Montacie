/*
 * F�lin.cpp
 *
 * Created on 25 octobre 2002, 17:42
 */

#include "Felin.h"

/** Cr�ation d'une nouvelle instance de la classe F�lin
 * @param type esp�ce de f�lins
 */
Felin::Felin(string type) : Animal (type, 4) {
    domestique = false;
}
    
/** pr�sentation des caract�ristiques du f�lin */
void Felin::presente() {
	Animal::presente();
    string etat = (domestique) ? "domestique" : "sauvage";         
    cout << "je suis vraiment un animal " << etat << endl;   
}
    
/** cri du f�lin */
void Felin::crie() {
	cout << "je rugis, et  j'ai faim  ..." << endl;
}
