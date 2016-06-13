#include <iostream>

using namespace std;

int main()
{
    int N, i, lowest;
    cin >> N;
    int X[N], pos;

    for(i = 0; i < N; i++){
        cin >> X[i];
    }

    lowest = X[0];

    for(i = 0; i < N; i++){
        if(X[i] < lowest){
            lowest = X[i];
            pos = i;
        }
    }

    cout << "Menor valor: " << lowest << endl;
    cout << "Posicao: " << pos << endl;
    return 0;
}
