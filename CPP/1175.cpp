#include <iostream>

using namespace std;

int main()
{
    int i, N[20], Ary[20], temp = 19;

    for(i = 0; i < 20; i++){
        cin >> Ary[i];
    }
    for(i = 0; i < 10; i++){
        N[i] = Ary[temp];
        temp --;
    }
    for(i = 10; i < 20; i++){
        N[i] = Ary[temp];
        temp --;
    }
    for(i = 0; i < 20; i++){
        cout << "N[" << i << "] = " << N[i] << endl;
    }
    return 0;
}
