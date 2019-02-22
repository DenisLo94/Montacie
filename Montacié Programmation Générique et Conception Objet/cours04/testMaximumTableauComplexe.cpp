#include "MaximumTableau.h"
#include "compareTo.h"
#include "TableauDyn.h"
#include "../Cours03/Complexe.h"

int main() {
	
   compareTo<Complexe> cmpComplexe;
   TableauDyn <Complexe> t(0,1);
   Complexe c1(-0.8,0.7); t.ecrire(0, c1);
   Complexe c2(0.8,0.6); t.ecrire(1, c2);
   Complexe c3(1.8,0.6); t.ecrire(2, c3);
   
   int j = MaximumTableau(t, t.getCapacite(), cmpComplexe);
   
   cout << j << endl;
   

return 0;
}