#include <iostream>
#include <algorithm>

using namespace std;

bool isC(char c) {
    return c == ',';
}

int countComma(const string& str) {
    int x = 0;
    auto iter = find_if(str.begin(), str.end(), isC);
    if(iter!=str.end()) ++x;
    while (iter != str.end()) {
        iter = find_if(next(iter), str.end(), isC);
        if(iter!=str.end()) ++x;
    }
    return x;
}

int main() {
    string s;
    getline(cin, s);
    int r = countComma(s);
    if(r < 1) cout << "undefined" << endl;
    else if(r == 1) cout << "kilo" << endl;
    else if(r == 2) cout << "mega" << endl;
    else if(r == 3) cout << "giga" << endl;
    return 0;
}
