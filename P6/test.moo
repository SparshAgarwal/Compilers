int gi;

int func(int a, int b){
  return a + b - 9;
}


void main(int af, int bf){
  int k;

  int c1;
  int c2;

  bool b;
  if("abc" != "abcdd"){
  	   cout<<"true!! abc != abcdd";
  }else{
	cout<<"fail abc != abcdd";
  }
  cout<<"Enter a bool value"
  cin>>b;
  cout<<"Enter a int value"
  cin>>c1;

  if(b){
  cout<<"true is entered";
}else{
	cout<<"false is entered";
}
     c2 = c1*2; 
     k = func(c1, c2);
     if(c1 > c2){
       cout <<"true\n";
     }else{
       cout<<"false\n";
     }

     while(c1 > 5){
       c1--;
       c2++;
     }
     cout<<"after\n";
     cout<<c1;  
     cout<<"   ";
     cout<<c2;

  return;
}

