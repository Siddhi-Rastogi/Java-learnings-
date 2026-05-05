#include <iostream>
#include <vector>
using namespace std;
int main(){
    vector <int> vc(3,5);
    vector <int> cc={1,2,3,4};
    for(int i=0; i<vc.size();i++){
        cout<<vc[i];
        // cout<<",";
    }
    for(int j=0; j<cc.size();j++){
        cout<<cc[j];
    }
    return 0;
}