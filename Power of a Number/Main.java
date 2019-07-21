#include <bits/stdc++.h>
#include <math.h>
using namespace std;
int main() {
int a,b;
  cin>>a>>b;
  if(b<0) {
    cout<<"Wrong input"<<endl;
  }
  else 
  {
    int c = pow(a,b);
    cout<<c<<endl;
  }
    return 0;
}