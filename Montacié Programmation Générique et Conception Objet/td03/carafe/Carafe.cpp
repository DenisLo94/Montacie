#include "Carafe.h"

Carafe::Carafe(int contenu_carafe, int capacite_carafe) {
	contenu = contenu_carafe;
	capacite = capacite_carafe;
}


void Carafe::remplir() {
	contenu = capacite;
}

void Carafe::operator++(int){
	remplir();
}


void Carafe::vider() {
	contenu = 0;
}


void Carafe::operator--(int){
	vider();
}



int Carafe::get_contenu() {
	return contenu;
}

int Carafe::get_capacite() {
	return capacite;
}


void Carafe::transvaser(Carafe &c) {
	if (((contenu + c.contenu) <= c.capacite)) {
		c.contenu += contenu;
		contenu = 0;
	} else {
		contenu-= (c.capacite-c.contenu);
		c.contenu = c.capacite;
	}
}


void Carafe::operator>>(Carafe &c) {
	transvaser(c);
}
