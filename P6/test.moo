int gi;

int function(int a, int b){
  cout<<"\nvalue of a: ";
  cout<<a;
  cout<<"\nvalue of b: ";
  cout<<b;
  return a + b - 9;
}


void main(int af, int bf){
  int k;

  int c1;
  int c2;

  bool b;
  if("abc" != "abcdd"){
  	   cout<<"\ntrue!! abc != abcdd";
  }else{
	cout<<"\nfail abc != abcdd";
  }
  cout<<"\nEnter a bool value: ";
  cin>>b;
  cout<<"\nEnter a int value for gi:";
  cin>>gi;

  if(b){
  cout<<"\ntrue is entered";
}else{
	cout<<"\nfalse is entered";
}
     c2 = gi*2; 
     k = function(gi, c2);
     if(gi > c2){
       cout <<"\ntrue gi>c2";
     }else{
       cout<<"\nfalse gi!>c2";
     }
     c1 = 6;
     while( c1 > 5){
       c1--;
       c2++;
     }
     cout<<"after\n";
     cout<<c1;  
     cout<<"   ";
     cout<<c2;

  return;
}

