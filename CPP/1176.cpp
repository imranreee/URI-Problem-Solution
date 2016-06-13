#include <iostream>

using namespace std;

int main()
{
    int i, T, N, j;

    cin >> T;

    for(i = 0; i < T; i++){
        cin >> N;
        if(N == 0){
            cout << "Fib(0) = 0" << endl;
        }
        else if(N == 1){
            cout << "Fib(1) = 1" << endl;
        }
        else{
            long long num1 = 0, num2 = 1;
            long long temp = 0;

            for(j = 2; j <= N; j++){
                temp = num2;
                num2 = num1 + num2;
                num1 = temp;
            }
            cout << "Fib(" << N << ") = " << num2 << endl;
        }
    }
    return 0;
}
