#include<iostream>

using namespace std;

int main(){
	/*         variavel */
	float n1,n2,n3,md;
	
	
	cout<<"Digite as notas: "<<endl;
	cin>>n1;
	cin>>n2;
	cin>>n3;
	
	md=(n1+n2+n3)/3;
	
	cout<<"\n Media = "<<md<<endl;
	
	if(md>=7){
		cout<<"\nAprovado"<<endl;
	}
	else if(md >=4 && md <7){
		cout<<"\nExame"<<endl;
	}
	else{
		cout<<"\nReprovado"<<endl;
	}
	
	
	
	
	return 0;
	
	
}
