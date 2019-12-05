#include <bits/stdc++.h>

using namespace std;
/*
 * Complete the timeConversion function below.
 */
string timeConversion(string s) {
    /*
     * Write your code here.
     */
string result = s.substr(0, 8), amORpm = s.substr(s.size() - 2), hour = s.substr(0, 2);

    if (amORpm == "PM" && hour != "12") {
        int digits = stoi(hour);
        digits = digits + 12;
        stringstream resultString;
        resultString << digits;
        result[0] = resultString.str()[0];
        result[1] = resultString.str()[1];
    }
    else if (amORpm == "AM" && hour == "12") {
        result[0] = result[1] = '0';
    } return result;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    string result = timeConversion(s);

    fout << result << "\n";

    fout.close();

    return 0;
}
