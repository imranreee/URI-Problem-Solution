#include <iostream>
#include <stdio.h>

using namespace std;

int main()
{
    float S = 0;
    for(int i = 1; i <= 100; i++){
        S += (float)1 / (float)i;
    }
    printf("%.2f\n", S);
    return 0;
}
