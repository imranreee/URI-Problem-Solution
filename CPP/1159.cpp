#include <iostream>

using namespace std;

int main()
{
    int N;
    while(1){
        int sum = 0, counter = 0;
        cin >> N;
        if(N == 0){
            break;
        }
        else{
            for(int i = N; ; i++){
                if(counter == 5){
                    cout << sum << endl;
                    break;
                }
                else if(i % 2 == 0){
                    sum += i;
                    counter ++;
                }
            }
        }
    }
    return 0;
}
