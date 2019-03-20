
#include <iostream>
#include <fstream>
#include <string>
#include <regex>
#include <iostream>
#include <vector>
using namespace std;





string getText(string nom_de_fichier_a_lire){
	ifstream flotIn;
	flotIn.open(nom_de_fichier_a_lire);
	string tout_le_texte = "";
	if (flotIn.fail()) cerr << "Impossible de lire le fichier\n";
	else{
		string line;
		while (getline(flotIn, line)){
			tout_le_texte = tout_le_texte + line;
		}
	}
	return tout_le_texte;
}


int renvoieNbreE(string phrase){
	int nbE = 0;
	for(int i = 0;i<phrase.length();i++){
		if(phrase[i]=='e'){
			nbE++;
		}
	}
	return nbE;
}

void printContentVector(vector<vector<int> > compteur_global){
	for (int i=0; i<compteur_global.size(); ++i) {
	   for (int j=0; j<compteur_global[i].size(); ++j) {
	       cout << compteur_global[i][j] << " ";
	   }
	   cout << endl;
	}
}


vector<vector<int> > getCompteur(){
	vector<vector<int> > compteur(256, vector<int>(2));
	for (int i=0;i<256;i++){
		compteur[i][0] = i;
		compteur[i][1] = 0;
	}
	return compteur;
}

int compterMots(string text){
	int nbMots = 1;
	for(char& c : text) {
		//cout << c <<endl;
		char comma = ',';
		char space = ' ';
		char point = '.';
		char tab = '\t';
		char question = '?';
		char excl = '!';
		if (c == comma or c == space or c == point or c == tab or c== tab
			or c == question or c == excl){
			nbMots++;
		}
	}
	return nbMots;
}


int renvoieNbreTokens(char phrase[], int size_phrase, int method){
	int nbToks =0;
	if (method == 1){
		nbToks++;
		string seps = " !?,.\n\t";
		for(int i=0;i<size_phrase;i++) {
			if (seps.find(phrase[i]) != std::string::npos) {
				nbToks++;
			}
		}
	}
	else if (method == 2){
		string pattern = "[^0-9A-Za-z]";
		regex e(pattern);
		for(int i=0;i<size_phrase;i++) {
			string s(1,phrase[i]); // convert to string otherwise regex not working
			if (regex_match(s, e)) {
				nbToks++;
			}
		}
	}
	else {
		cout << "Je ne trouve pas la méthode !" << endl;
	}
	return nbToks;
}




vector<vector<int> > compteur_chars(string some_text, vector<vector<int> > compteur_global){
	for(int i = 0;i<some_text.length();i++){
		char c = some_text[i];
		int code_c = int(c);
		compteur_global[code_c][1] ++;
	}
	return compteur_global;
}






int main(){
	string nom_du_fichier = "la_destinee.txt";
	string tout_le_texte = getText(nom_du_fichier);
	int comptage = compterMots(tout_le_texte);
	cout << "Le nombre de tokens est :" << comptage << endl;
	char phrase[] = "ebebeahabe bee ebah";
	string phrase2 = "ebebeahabe bee ebah";
	int size_phrase = sizeof(phrase)/sizeof(*phrase);
	int nbToks = renvoieNbreTokens(phrase, size_phrase, 2);
	cout << "Le nombre de tokens est :" << nbToks << endl;
	cout << "Le nombre de E est :" << renvoieNbreE(phrase2) <<endl;
	vector<vector<int> > compteur_global = getCompteur();
	compteur_global = compteur_chars(phrase2, compteur_global);
	printContentVector(compteur_global);
	return comptage;
}
