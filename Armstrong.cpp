// #include <iostream>
// #include <cmath>
// using namespace std;
// int main(){
//     int length=0,rem=0,ans=0;
//     int n;
//     cout<<"enter number:";
//     cin>>n;
//     int original=n;
//     while(n>0){
//         n=n/10;
//         length++;
//     }
//     n=original;
//     // cout<<n<<endl;
//     while(n>0){
//         rem=n%10;
//         ans=ans + round(pow(rem,length));
//         n=n/10;   
//     }
//     // cout<<ans<<endl;

//     if(ans==original){
//         cout<<"the given no. is an armstrong number";

//     }
//     else{
//         cout<<"the given no. is not an armstrong number";
//     }
// }


    // #include <iostream>
    // using namespace std;

    // int fibo(int n) {
    //     if (n == 0) return 0;
    //     if (n == 1) return 1;
    //     return fibo(n - 1) + fibo(n - 2);
    // }

    // int main() {
    //     int n;
    //     cout << "Enter terms: ";
    //     cin >> n;

    //     for (int i = 0; i < n; i++) {
    //         cout << fibo(i) << " ";
    //     }
    //     return 0;
    // }
// #include <iostream>
// #include<cmath>
// using namespace std;
// int main(){
//     int n;
//     int length=0,ans=0;
//     int rem=0;
//     cout<<"enter n:";
//     cin>>n;
//     int original=n;
//     int temp=n;
//     while(n>0){
//         n=n/10;
//         length++;
//     }
//     while(original>0){
//         rem=original%10;
//         ans=ans+ round(pow(rem,length));
//         original=original/10;
//         length--;
//     }
//     if(ans==temp){
//         cout<<"the given no. is a Disarium number";
//     }
//     else{
//         cout<<"the given no. is not a Disarium number";
//     }
// }

// #include<iostream>
// using namespace std;
// int main(){
//     int n;
//     int rem=0,ans=0;
//     cout<<"enter n:";
//     cin>>n;

//     while(n>0){
//         rem=n%10;      //123=3       12=2     
//         ans=ans*10+rem;      //0=0*10+3        3=3*10+2
//         n=n/10;        //123/10=12
//     }
//     cout<< ans<<endl;
// }
// #include<iostream>
// using namespace std;
// int  main(){
//     int a=10,b=15, c=1;
//     int largest;

// // method 1


//     // if(a>b && a>c){
//     //     largest=a;

//     // }else if(b>a && b>c){
//     //     largest=b;
//     // }
//     // else{
//     //     largest=c;
//     // }
//     // cout<<largest;

// // method 2

//     // a>b?(a>c?largest=a:largest=c):(b>c?largest=b:largest=c);
//     // cout<<largest;

// // method 3


// largest=max(max(a,b),max(a,c));
// cout<<largest;


// }
// #include<iostream>
// using namespace std;
// int  main(){
//     char a;
//     string s;
//     int count=0;
//     cout<<"Enter the string :";
//     cin>>s;
//     cout<<"Enter the char :";
//     cin>>a;
//     for(int i=0; i<s.length();i++){
//         if(s[i]==a){
//             count++;
//         }

//     }
//     cout<<count<<" number of times "<<a<< " is occuring in the given string"<<endl;

// }

// #include<iostream>
// #include<string>
// using namespace std;
// int main(){
//     string str="siddhi", str2="sambhav";
//     // str=str+" "+str2;
//     // str.append(str2);
//     str.append(" ").append(str2);
//     // str.append(4,'!');
//     // str.append(str2,0,4);
//     cout<<str<<endl;
// }

// #include<iostream>
// #include<string>
// using namespace std;
// int main(){
//     string str="banana";
//     // string b="ban";
//     int i, j;
//     cin>>i,j;
//     str.erase(i,j);
//     cout<<str;
// }
// #include<iostream>
// #include<string>
// #include <cctype>

// using namespace std;
// int main(){
//     string str="siddhi";
//     string str1;
//     int size=str.length();
//     for(int i=0;i<size;i++){
//         str[i]=char(int(str[i])-32);
//          str1 += toupper(str[i]);
//     }
//     cout<<str<<endl;
//     cout<<str1<<endl;

// }
// #include <iostream>
// #include <string>
// using namespace std;
// int main() {
//     string s = "World";
//     cout << "First character (front): " << s.front() << "\n";
//     cout << "Last character (back): " << s.back() << "\n";
//     // Modify using front() and back()
//     s.front() = 'H';
//     s.back() = '!';
//     cout << "Modified string: " << s << "\n";
//     return 0;
// }

// #include <iostream>
// #include <string>
// using namespace std;
// int main() {
//     string s = "banana";
//     size_t pos1 = s.find('k');        // first 'a'
//     size_t pos2 = s.find("ana");      // first 'ana'
//     size_t pos3 = s.rfind('k');       // last 'a'
//     cout << "First 'a' at index: " << pos1 << "\n";
//     cout << "First ana at index: " << pos2 << "\n";
//     cout << "Last 'a' at index: " << pos3 << "\n";
//     return 0;
// }

// bubble sort

// #include <iostream>
// #include <string>
// using namespace std;

// int main(){
//     int arr[]={5,6,3,9,4,2,1,8,0,-89};
//     int n= sizeof(arr)/sizeof(arr[0]);
//     for(int i=0;i<n-1;i++){
//         for(int j=0;j<n-1-i;j++){
//             if(arr[j]>arr[j+1]){
//                 swap(arr[j],arr[j+1]);
//             }
//         }
//     }
//     cout<<"Array After Swapping"<<endl;
//     for(int i:arr){
//         cout<<i<<"  ";
//     }
// }

#include <iostream>
using namespace std;

int main() {
    int m;
    cin >> m;

    switch(m) {
        case 1: case 3: case 5: case 7:
        case 8: case 10: case 12:
            cout << "31 days"; break;
        case 4: case 6: case 9: case 11:
            cout << "30 days"; break;
        case 2:
            cout << "28 days"; break;
        default:
            cout << "Invalid month";
    }
    return 0;
}
