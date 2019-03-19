#include "Date.h"
#include <iostream>



int main(){
	std::cout << "Bonjour !" << std::endl;
	Date annif = Date(10, 3, 1991);
	Date annif_flo = Date(1,5,1987);
	std::cout << "L'annif d'Olga est avant celui de Florian " << annif.CompareTo(annif_flo)<< std::endl;
	annif.Afficher();
	Date zomaar = Date();
	annif.Incrementer();
	annif.Afficher();
	return 0;
}
