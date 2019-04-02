#include <iostream>
#include <map>
#include <string>

using namespace std;


int main() {
	multimap<int, string,  less<int>> conjug;
	conjug.insert(make_pair(1, "parler"));
	conjug.insert(make_pair(2, "choisir"));
	conjug.insert(make_pair(3, "prendre"));
	conjug.insert(make_pair(2, "finir"));
	conjug.insert(make_pair(1, "manger"));

	auto range = conjug.equal_range(2);
	for (auto it = range.first; it != range.second; ++it) {
	        std::cout << it->second << '\n';
	    }

	}


