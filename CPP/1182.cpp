#include <iostream>
#include <stdio.h>

using namespace std;

int main()
{
    int C, i, j;
    float M[12][12], sum = 0;
    char T;

    cin >> C >> T;

    for(i= 0; i < 12; i++){
        for(j = 0; j < 12; j++){
            cin >> M[i][j];
        }
    }

    for(i = 0; i < 12; i++){
        sum += M[i][C];
    }

    if(T == 'S'){
        printf("%.1f\n", sum);
    }
    else if(T == 'M'){
        printf("%.1f\n", sum / 12.00);
    }

    return 0;
}
