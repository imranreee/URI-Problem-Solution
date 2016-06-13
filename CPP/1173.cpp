#include <iostream>

using namespace std;

int main()
{
    int i, V, N[10];

    cin >> V;

    for(i = 0; i < 10; i++){
        N[i] = V;
        V = V + V;
    }
    for(i = 0; i < 10; i++){
        cout << "N[" << i << "] = " << N[i] << endl;
    }
    return 0;
}
