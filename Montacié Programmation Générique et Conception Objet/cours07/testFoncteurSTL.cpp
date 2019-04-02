#include <iostream>
#include "../cours03/Identite.h"

#include <functional>
using namespace std;

template <class T, class F>
T applique(T i, T j, F foncteur) {
    // Applique l'operateur fonctionnel au foncteur
    // avec comme arguments les deux premiers param�tres :
    return foncteur(i, j);
}

int main(void) {
   
    Identite Id1("Ducrut","Lucie"), Id2 ("Herbrant","Claude");
    
    // Utilisation du foncteur "plus" pour faire faire une addition
    // � la fonction "applique" :
    cout << applique(Id1, Id2, plus <Identite>()) << endl;
    return 0;
}
