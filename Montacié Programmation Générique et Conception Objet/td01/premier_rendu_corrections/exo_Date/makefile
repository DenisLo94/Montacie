MonPremierProgramme: MonPremierProgramme.o
		g++ MonPremierProgramme.o -o MonPremierProgramme.exe
	
MonPremierProgramme.o: MonPremierProgramme.cpp 
		g++ -c MonPremierProgramme.cpp

Paire: Paire.o Parite.o
		g++ Paire.o Parite.o -o Paire.exe
	
Paire.o: Paire.h Parite.h Paire.cpp
		g++ -c Paire.cpp
	
Parite.o: Parite.h Parite.cpp
	g++ -c Parite.cpp
	
test: test.o Date.o
		g++ Date.o test.o -o test.exe
	
Date.o: Date.h Date.cpp
		g++ -c Date.cpp

test.o: Date.h test.cpp
		g++ -c test.cpp	

clean: 
	rm -f *.o *.exe
	