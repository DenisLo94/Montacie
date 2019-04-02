all: testFoncteurSTL testMap testMultimap testMultimap2 testPriorityQueue testSet testMultiset
	
testFoncteurSTL: testFoncteurSTL.o
	g++ -w -g testFoncteurSTL.o ../cours03/Identite.o -o testFoncteurSTL.exe
	
testFoncteurSTL.o: testFoncteurSTL.cpp
	g++ -std=c++0x -c -w -g testFoncteurSTL.cpp
	
testMap: testMap.cpp
	g++ -std=c++0x -w -g testMap.cpp -o testMap.exe
	
testMultimap: testMultimap.cpp 
	g++ -std=c++0x -w -g testMultimap.cpp -o testMultimap.exe
	
testMultimap2: testMultimap2.cpp 
	g++ -std=c++0x -w -g testMultimap2.cpp -o testMultimap2.exe
	
testPriorityQueue: testPriorityQueue.o Patient.o
	g++ -std=c++0x -w -g testPriorityQueue.o Patient.o -o testPriorityQueue.exe 
	
Patient.o: Patient.cpp Patient.h
	g++ -std=c++0x -c -w -g Patient.cpp
	
testPriorityQueue.o: testPriorityQueue.cpp Patient.h
	g++ -std=c++0x -c -w -g testPriorityQueue.cpp
	
testSet: testSet.o Patient.o
	g++ -w -g testSet.o Patient.o -o testSet.exe 
	
testSet.o: testSet.cpp Patient.h
	g++ -std=c++0x -c -w -g testSet.cpp
	
testMultiset: testMultiset.cpp
	g++ -w -g testMultiset.cpp -o testMultiset.exe
	
clean: 
	rm -f *.o *.exe	