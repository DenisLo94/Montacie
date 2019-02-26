#include <iostream>
#include <fstream>
using namespace std;

int main()

{

　　ofstream naissance("Naissance.txt");
   naissance<<"Chen est né le 12 juin 1993";
   naissance.close();

　　if (naissance.fail())

　　{
　　　　cout<<"il y a une erruer!"<<endl;

　　 }




}
