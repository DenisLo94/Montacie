#include "TableauDyn.h"
#include "../Cours01/Etudiant.h"
#include "../Cours03/Complexe.h"

int main() {
TableauDyn <Etudiant> t1(0,1);
Etudiant Pascal;
Pascal.putnote(3, 15);
t1.ecrire(0, Pascal);

Etudiant e = t1.lire(0);
cout << e.getnote(3) << endl;

TableauDyn <Complexe> t2(1,2);
Complexe c1(-0.8,0.7), c2;
c2 = c1 * c1;
t2.ecrire(1, c2);

c1 = t2.lire(1); 
cout << c1 << endl;


return 0;
}
