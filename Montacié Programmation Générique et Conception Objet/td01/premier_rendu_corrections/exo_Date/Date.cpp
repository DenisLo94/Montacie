#include "Date.h"


// constructeur vide (m_NombreNoteDef notes)
Date::Date() {
	Lire();
}
// constructeur non vide
Date::Date(int j, int m, int a){
	jour = j;
	mois = m;
	annee = a;
}



bool Date::CompareTo(Date d) {
	if (annee != d.annee) return true;
	if (mois != d.mois) return true;
	if (jour != d.jour) return true;
	else return false;
}

void Date::Incrementer() {
	int lmois[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	// prise en compte des annees bissextiles
	if (((annee % 4) == 0) && ((annee % 400) != 0)) lmois[1]++;
		jour++;
		if (jour > lmois[mois-1]) {
			jour = 1; mois ++;
			if (mois == 13) {annee++; mois = 1;}
			}
}

void Date::Afficher() {
	std::cout << "La date est : " << jour << "/" << mois << "/" << annee << std::endl;
}

void Date::Lire() {
	int j, m, a;
	std::cout << "le jour " << std::endl;
	std::cin >> j; // lecture de la variable n
	std::cout << "le mois " << std::endl;
	std::cin >> m; // lecture de la variable n
	std::cout << "l'annee " << std::endl;
	std::cin >> a; // lecture de la variable n
}

