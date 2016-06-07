#include <iostream>

using namespace std;

int main()
{
    int i, T, PA, PB;
    float G1, G2;

    cin >> T;

    for(i = 0; i < T; i++){
        cin >> PA >> PB;
        cin >> G1 >> G2;

        int years = 0;
        int temp = 0;

        while(PA <= PB){
            PA += PA * G1 / 100;
            PB += PB * G2 / 100;
            years ++;

            if(years > 100){
                temp = 1;
                break;
            }
        }
        if(temp == 1){
            cout << "Mais de 1 seculo." << endl;
        }
        else{
            cout << years << " anos." << endl;
        }
    }
    return 0;
}
