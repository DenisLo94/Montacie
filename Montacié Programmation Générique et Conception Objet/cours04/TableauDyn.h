/**
 * @file TableauDyn.h
 * @author montacie 
 * @version 1 19/02/06
 * @brief Composant de tableau dynamique d'items
 * Programmation g�n�rique et conception objet
 */
 
#include <iostream> // d�claration des flots standard
#include <cassert>
using namespace std;

// classe g�n�rique de tableau dynamique
template <typename T> class TableauDyn {
protected :
	unsigned int capacite; 	   	// capacit� du tableau tab
	unsigned int pasExtension; 	// pas d'extension du tableau
	T* tab;				   		// tableau allou� en m�moire dynamique
	void agrandir();
public :
	TableauDyn(unsigned int c, int p);
	~TableauDyn();
	T lire(unsigned int i) const;
	void ecrire(unsigned int i, T it);
	int getCapacite();
};

/**
 * @brief constructeur du tableau d'items dynamique 
 * caract�ris� par un pas d'extension (p)
 * Allocation en m�moire dynamique du tableau d'items 
 * de capacit� (c) caract�ris� par un pas d'extension (p)
 * @param [in] c : capacit� du tableau
 * @param [in] p : capacit� du tableau
 */
template <typename T> TableauDyn<T>::TableauDyn(unsigned int c, int p) {
	assert((c>=0) && (p>0));
	capacite = c;
	pasExtension = p;
	// arr�t du programme en cas d'erreur d'allocation
	tab = new T[capacite];
}


/**
 * @brief destructeur du tableau d'items en m�moire dynamique
 */
template <typename T>TableauDyn<T>::~TableauDyn() {
	delete [] tab;
	tab = NULL;
}

/**
 * @brief Lecture d'un item d'un tableau d'items
 * @param[in] i : l'indice de l'item dans le tableau
 * @return l'item au poste i
 * @pre i < nbItems   
 */
template <typename T> T TableauDyn<T>::lire(unsigned int i) const {
	assert(i < capacite);
	return tab[i];
}

/**
 * @brief Ecrire un item dans un tableau d'items
 * @param[in] i : l'indice o� �crire l'item
 * @param[in] item : l'item � �crire
 * @pre i <= capacite   
 */
template <typename T> void TableauDyn<T>::ecrire(unsigned int i, T it) {
	assert(i>=0);
	while (i >= capacite) agrandir();
	tab[i] = it;
}

/**
 * @brief Lecture de la capacite du tableau d'items
 * @return capacite du tableau
 */
 template <typename T> int TableauDyn<T>::getCapacite() {
 	return capacite;
}
 

/**
 * @brief Agrandir un tableau d'items de son pas d'extension
 */
template <typename T> void TableauDyn<T>::agrandir() {
	/* Allocation d'un tableau de (capacite + pasExtension) items */
	T* newT = new T[capacite + pasExtension];
	/* Recopie des (capacite) �l�ments du tableau dans le nouveau tableau */
	for (unsigned int i = 0; i < capacite; ++i)
		newT[i] = tab[i];
	/* D�sallocation de l'ancien tableau d'items */
	delete [] tab;
	/* Mise � jour de tab et de la capacit� du nouveau tableau 
	 * r�sultant de l'extension de capacit� */
	tab = newT;
	capacite += pasExtension;
}
