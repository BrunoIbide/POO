
public class CotacaoDolar
{
    
    public static void main(String[] args){
    double valorDolar = 4.60;
    double qtdReal = 5;
    double total= 5 * 4.60;
    double totalDesconto;
    double porcentagem;
    
    if(total > 100 ){
        porcentagem = total*0.05;
        totalDesconto = total - porcentagem;
        System.out.println("Total:"+totalDesconto);
         
    
}
   else if (total > 1000 ){
       
       porcentagem = total*0.10;
        totalDesconto = total - porcentagem;
        System.out.println("Total:"+totalDesconto);
       
       
    }
}
}
