/*
 * Chat.h
 *
 * Created on 25 octobre 2002, 17:35
 */

#include "Felin.h"

/** Cr�ation et gestion de chats
 * @author montacie
 */
class Chat : public Felin {
private:
    string nom;
public:
    /** cr�ation d'une nouvelle instance de la classe Chat
     * @param LeNom nom du chat
     */
    Chat(string LeNom);

   /** cr�ation d'une nouvelle instance de la classe Chat */
    Chat();
	
	/** accesseur en �criture de l'attribut du chat */
	void setNom(string LeNom); 
    
    /** pr�sentation des caract�ristiques du chat */    
    void presente();
    
    /** cri du chat */    
    void crie();
};
