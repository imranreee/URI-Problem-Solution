#include <iostream>
#include <stdio.h>

using namespace std;

int main()
{
    double X, N[100];

    cin >> X;

    for(int i = 0; i < 100; i++){
       printf("N[%d] = %.4lf\n", i, X);
       X = X / 2.00;
    }
    return 0;
}
