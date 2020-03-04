#include <stdio.h>

int main(){
	
	double A,B,C;
	double TRIANGULO,CIRCULO,TRAPEZIO,QUADRADO,RETANGULO;
	
	scanf("%lf %lf %lf",&A,&B,&C);
	
	TRIANGULO = (A*C)/2;
	CIRCULO=3.14159*(C*C);
	TRAPEZIO=(A+B)*C/2;
	QUADRADO=(B*B);
	RETANGULO=(A*B);
	
	
	printf("\nTRIANGULO = %.3lf",TRIANGULO);
	printf("\nCIRCULO = %.3lf",CIRCULO);
	printf("\nTRAPEZIO = %.3lf",TRAPEZIO);
	printf("\nQUADRADO = %.3lf",QUADRADO);
	printf("\nRETANGULO = %.3lf",RETANGULO);
	
	
	
	
	return 0;
	
	
}
