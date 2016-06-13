#include <iostream>
#include <stdio.h>

using namespace std;

int main()
{
    double M[12][12], sum = 0;
    int i, j, temp = 0;
    char O;
    cin >> O;

    for(i = 0; i < 12; i++){
        for(j = 0; j < 12; j++){
            cin >> M[i][j];
        }
    }

    for(i = 1; i < 6; i++){
        for(j = 0; j < i; j++){
            sum += M[i][j];
        }
    }

    for(i = 6; i < 11; i++){
        for(j = 0; j < 5 - temp; j++){
            sum += M[i][j];
        }
        temp ++;
    }

    if(O == 'S'){
        printf("%.1lf\n", sum);
    }
    else if(O == 'M'){
        printf("%.1lf\n", sum / 30);
    }

    return 0;
}
