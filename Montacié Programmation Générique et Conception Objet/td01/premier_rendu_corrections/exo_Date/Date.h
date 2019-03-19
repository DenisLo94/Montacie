#include <iostream>

class Date {


private:
	int jour, mois, annee;


public:
	Date(int j, int m, int a);
	Date();
	bool CompareTo(Date d);
	void Incrementer();
	void Afficher();
	void Lire();
};
