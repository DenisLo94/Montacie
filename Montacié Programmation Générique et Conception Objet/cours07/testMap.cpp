#include <iostream>
#include <map>
#include <string>
using namespace std;

typedef map<string, float, less<string> > mStringFloat;
typedef mStringFloat::iterator imStringFloat;

void prix(mStringFloat prixFruit, string fruit) {
	imStringFloat it;
	if ((it = prixFruit.find(fruit)) == prixFruit.end())
		cout << "fruit non reference"; else cout << it->second;
	cout << endl; 
}

int main() {
	mStringFloat prixFruit;   
	prixFruit.insert(make_pair("poire", 1.5));
	prixFruit.insert(make_pair("peche", 2.7));
	prixFruit.insert(make_pair("orange", 1.2));
	prix(prixFruit, "poire");
	prix(prixFruit, "pomme");
}


