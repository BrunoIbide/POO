

//Conta
// O que ela tem:
    //-saldo
    
// O que ela faz
//  deposito
//  saque
//  transferencia    
public class Conta
{
    private double saldo = 0;
  
    
    public double deposito(double valorDeposito){
     saldo = saldo + valorDeposito; 
     return saldo;
        
}
    public void saque(double valorSaque){
        if(valorSaque <= saldo){
        saldo = saldo - valorSaque;
        
}
        else{
            System.out.println("Saldo insuficiente");
}
}   
    public double saldoConta(){
        return saldo;
    }
}





