#include <iostream>

using namespace std;

int main()
{
    int i, j, numberOfTC, number;
    cin >> numberOfTC;

    for(i = 0; i < numberOfTC; i++){
        int sum = 0;
        cin >> number;
        for(j = 1; j < number; j++){
            if(number % j == 0){
                sum += j;
            }
        }
        if(sum == number){
                cout << number <<" eh perfeito" << endl;
            }
            else{
                cout << number << " nao eh perfeito" << endl;
            }

    }
    return 0;
}
