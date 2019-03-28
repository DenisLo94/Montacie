#include "Carafe.h"

int main(){
	Carafe carafe1 = Carafe(10,20);
	cout << carafe1.get_contenu() << "\n" <<endl;
	carafe1++;
	cout << carafe1.get_contenu() << "\n" <<endl;
	carafe1--;
	cout << carafe1.get_contenu() << "\n" <<endl;
	carafe1++;
	Carafe carafe2 = Carafe(30,50);
	carafe1>>carafe2;
	cout <<  "-----------------------" <<endl;
	cout << carafe1.get_contenu() << "\n" <<endl;
	cout << carafe2.get_contenu() << "\n" <<endl;
	return 0;
}
