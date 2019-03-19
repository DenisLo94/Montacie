
#include <iostream>
#include <fstream>
#include <string>
using namespace std;


bool Verifier(){
	ifstream flotIn;
	flotIn.open("Naissance.txt");
	if (flotIn.fail()) cerr << "Impossible de lire le fichier\n";
	else{
		string string_in_file;
		string date = "10-03-1991";
		while (getline(flotIn, string_in_file)){
			if (string_in_file.find(date)) {
				return true;
			}
			getline(flotIn, string_in_file);
		}
	}
	return false;
}


int main() {
	ofstream flotOut;
	cout << "Ecriture dans fichier date de naissance" <<endl;
	flotOut.open("Naissance.txt");
	if (flotOut.fail()) cerr << "Impossible d'écrire dans le fichier\n";
	else {
	string date = "10-03-1991";
    flotOut.write((char*) &date, sizeof(date));
    flotOut.close();
	}
	bool answer = Verifier();
	cout << "la date est bien écrite dans le fichier : " << answer << endl;
	return 0;
}
