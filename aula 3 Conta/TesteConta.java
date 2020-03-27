

public class TesteConta
{
   public static void main(String [] args) {
     Conta c = new Conta();
     //c.deposito(600.0);
     //System.out.println(c.saldo);
     //c.saque(200.0);
     //System.out.println(c.saldo);
     
     //Conta c2 = new Conta();
     //c2.deposito(1000.0);
     //System.out.println(c2.saldo);
     //c2.saque(200.0);
     //System.out.println(c2.saldo);
     
     double saldoTotal = c.deposito (600.0);
     System.out.println("saldo total: " +saldoTotal);
       
     c.saque(800.0);
     System.out.println(c.saldoConta());
     
     
}
}