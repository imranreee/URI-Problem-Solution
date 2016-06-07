#include <iostream>

using namespace std;

int main()
{
    int i, j, N, number;

    cin >> N;

    for(i = 0; i < N; i++){
        cin >> number;
        int temp = 0;

        for(j = 2; j < number; j++){
            if(number % j == 0){
                temp = 1;
            }
        }
        if(temp == 1){
            cout << number << " nao eh primo" <<endl;
        }
        else{
            cout << number << " eh primo" << endl;
        }
    }
    return 0;
}
