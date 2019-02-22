#ifndef COMPARETO_H_
#define COMPARETO_H_

#endif /*COMPARETO_H_*/

// Définition du foncteur binaire de comparaison avec mémorisation
template <typename T> class compareTo {
  	private:
  	int res; // mémorisation du résultat
  	public:
    int operator () (const T& x, const T& y) {
    	res = x.compareTo(y); 
      return res;
    }
    int get() const {return res;}
  };
