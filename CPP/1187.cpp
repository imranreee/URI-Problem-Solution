#include <iostream>
#include <stdio.h>

using namespace std;

int main()
{
    double M[12][12], sum = 0;
    int i, j;
    char O;
    cin >> O;

    for(i = 0; i < 12; i++){
        for(j = 0; j < 12; j++){
            cin >> M[i][j];
        }
    }

    for(i = 0; i < 5; i++){
        for(j = 1 + i; j < 11 - i; j++){
            sum += M[i][j];
        }
    }

    if(O == 'S'){
        printf("%.1lf\n", sum);
    }
    else if(O == 'M'){
        printf("%.1lf\n", sum / 30);
    }

    return 0;
}
