exo2: exo2.o 
		g++ exo2.o -o exo2.exe
	
exo2.o: exo2.cpp
		g++ -c exo2.cpp
		
test_regex: test_regex.o 
		g++ test_regex.o -o test_regex.exe
	
test_regex.o: test_regex.cpp
		g++ -c test_regex.cpp
		
compterMots: compterMots.o 
		g++ compterMots.o -o compterMots.exe
	
compterMots.o: compterMots.cpp
		g++ -c compterMots.cpp
	
MonPremierFichierTexte: MonPremierFichierTexte.o 
		g++ MonPremierFichierTexte.o -o MonPremierFichierTexte.exe
		
MonPremierFichierTexte.o: MonPremierFichierTexte.cpp
		g++ -c MonPremierFichierTexte.cpp	

clean: 
	rm -f *.o *.exe