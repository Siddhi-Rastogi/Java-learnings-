#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"enter n:";
    cin>>n;
    for(int i=1; i<=n;i++){ 
        for(int k=1 ; k<=(n-i); k++ ){
        cout<<" ";
        }
        for(int j=1; j<=i;j++){
            cout<<"*";
            // for(int k=0)
        }
        
        for(int m=2; m<=i;m++){
            cout<<"*";
        }
        for(int l=1 ; l<=(n-i); l++ ){
        cout<<" ";
        }
        cout<<endl;
       
    }
return 0;
}