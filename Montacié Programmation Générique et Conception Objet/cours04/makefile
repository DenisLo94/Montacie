all: testMinimum testTableauDyn testMaximumTableauComplexe Point testTableauDyn2Chat testSofstream testTableauDynQ

testMinimum: testMinimum.o 
	g++ -g testMinimum.o -o testMinimum.exe
	
testMinimum.o: testMinimum.cpp Minimum.h
	g++ -c -g testMinimum.cpp
	
Point: Point.cpp
	g++ -g Point.cpp -o Point.exe

testTableauDyn: testTableauDyn.o ../Cours01/Etudiant.o
	g++ -g testTableauDyn.o ../Cours01/Etudiant.o ../Cours03/Complexe.o -o testTableauDyn.exe

testTableauDyn.o: testTableauDyn.cpp TableauDyn.h
	g++ -c -g testTableauDyn.cpp
	
testMaximumTableauComplexe: testMaximumTableauComplexe.o
	g++ -g testMaximumTableauComplexe.o ../Cours03/Complexe.o -o testMaximumTableauComplexe.exe
	
testTableauDyn2Chat: testTableauDyn2Chat.cpp ../Cours03/Chat.o ../Cours03/Felin.o ../Cours03/Animal.o
	g++ -g testTableauDyn2Chat.cpp ../Cours03/Chat.o ../Cours03/Felin.o ../Cours03/Animal.o -o testTableauDyn2Chat.exe
	
testSofstream : testSofstream.cpp ../Cours03/Animal.o
	g++ -g testSofstream.cpp ../Cours03/Animal.o -o testSofstream.exe
	
testTableauDynQ : testTableauDynQ.cpp ../tp01/Date.o ../Cours01/Etudiant.o
	g++ -g testTableauDynQ.cpp ../tp01/Date.o ../Cours01/Etudiant.o -o testTableauDyn2.exe

testMaximumTableauComplexe.o: testMaximumTableauComplexe.cpp MaximumTableau.h compareTo.h 
	g++ -w -g -c testMaximumTableauComplexe.cpp

clean: 
	-del -f *.o *.exe
	