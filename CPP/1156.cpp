#include <iostream>
#include <stdio.h>

using namespace std;

int main()
{
    float S = 1, temp = 2;
    for(int i = 3; i <= 39; i += 2){
        S += (float)i / temp;
        temp *= 2;
    }
    printf("%.2f\n", S);
    return 0;
}
