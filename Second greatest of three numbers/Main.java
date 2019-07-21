#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  int second;
 if(a<b) {
   if(b<c) 
     second = b;
   else 
     second = (a<c ? c:a);
 }
   else {
     if(a<c) second = a;
     else 
       second = (b<c ? c:b);
   }
   printf("%d",second);
  return 0;
}