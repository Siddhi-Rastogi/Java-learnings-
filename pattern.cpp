#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter no. of row you want to put: ";
    cin>>n;

    for(int i=0;i<=n;i++){
        for(int j=(n-i);j>0;j--){
            cout<<" * ";
        }


        cout<<endl;
    }
}