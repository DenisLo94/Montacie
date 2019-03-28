test : test.o Carafe.o
	g++ test.o Carafe.o -o test.exe
	
Carafe.o : Carafe.h Carafe.cpp
	g++ -c Carafe.cpp
	
test.o : test.cpp
	g++ -c test.cpp
	
clean :
rm -f *.o *.exe