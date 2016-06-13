#include <iostream>

using namespace std;

int main()
{
    int T, value = 0;
    int N[1000];

    cin >> T;

    for(int i = 0; i < 1000; i++){
        N[i] = value;
        value ++;
        if(value == T){
            value = 0;
        }
    }
    for(int i = 0; i < 1000; i++){
        cout << "N[" << i << "] = " << N[i] << endl;
    }
    return 0;
}
