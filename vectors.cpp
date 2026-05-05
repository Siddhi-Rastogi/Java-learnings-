#include<iostream>
#include<vector>
using namespace std;
int main(){
    int n;
    cout<<"Enter number of elements: ";
    cin>>n;
    vector<int> vec;
    cout<<"Enter "<<n<<" elements:"<<endl;
    // for(int i=0; i<n; i++){
    //     int element;
    //     cin>>element;
    //     vec.push_back(element);
    // }
    int a;
    while(cin>>a){
        vec.push_back(a);
    }
    cout<<"You entered:"<<endl;
    for(int i=0; i<vec.size(); i++){
        cout<<vec[i]<<" ";
    }
    cout<<endl;
    
    return 0;
}