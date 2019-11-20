#include <bits/stdc++.h>
#include <cmath>

using namespace std;

int pwrsm(int x, int n, int z) {
    if(pow(z, n) < x) return pwrsm(x, n, z + 1) + pwrsm(x-pow(z, n), n, z + 1);
    if(pow(z, n) == x) return 1;
    return 0;
}
// Complete the powerSum function below.
int powerSum(int X, int N) {
    return pwrsm(X, N, 1);
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int X;
    cin >> X;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    int N;
    cin >> N;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    int result = powerSum(X, N);

    fout << result << "\n";

    fout.close();

    return 0;
}
