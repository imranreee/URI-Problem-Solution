#include <iostream>

using namespace std;

int main()
{
    int i, j, N, startingNumber, endingNumber;
    cin >> N;
    for(i = 0; i < N; i++){
        int sum = 0, counter = 0;
        cin >> startingNumber >> endingNumber;
        for(j = startingNumber; ; j++){
            if(counter == endingNumber){
                cout << sum << endl;
                break;
            }
            if(j % 2 != 0){
                sum += j;
                counter ++;
            }
        }
    }
    return 0;
}
