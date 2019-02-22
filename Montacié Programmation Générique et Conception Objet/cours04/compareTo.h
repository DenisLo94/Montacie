#ifndef COMPARETO_H_
#define COMPARETO_H_

#endif /*COMPARETO_H_*/

// D�finition du foncteur binaire de comparaison avec m�morisation
template <typename T> class compareTo {
  	private:
  	int res; // m�morisation du r�sultat
  	public:
    int operator () (const T& x, const T& y) {
    	res = x.compareTo(y); 
      return res;
    }
    int get() const {return res;}
  };
