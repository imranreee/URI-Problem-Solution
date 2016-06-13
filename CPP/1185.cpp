#include <iostream>
#include <stdio.h>

using namespace std;

int main()
{
    float M[12][12], sum = 0;
    int i, j;
    char O;
    cin >> O;

    for(i = 0; i < 12; i++){
        for(j = 0; j < 12; j++){
            cin >> M[i][j];
        }
    }

    for(i = 0; i < 11; i++){
        for(j = 0; j < 11 - i; j++){
            sum += M[i][j];
        }
    }

    if(O == 'S'){
        printf("%.1f\n", sum);
    }
    else if(O == 'M'){
        printf("%.1f\n", sum / 66);
    }

    return 0;
}
