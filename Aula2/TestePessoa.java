

public class TestePessoa
{
    
    
   public static void main(String [] args){
       
       int x = 10;
       System.out.println(x);
       
       Pessoa p1 = new Pessoa();
       p1.nome = "Bruno";
       p1.doador = false;
       p1.endereco = "Bauru";
       System.out.println(p1);
       System.out.println(p1.nome);
       System.out.println(p1.doador);
       System.out.println(p1.endereco);
       
       Pessoa p2 = new Pessoa();
       p2.nome="Bruno";
       p2.idade = 19;
       System.out.println(p2.nome);
       System.out.println(p2.idade);
       
       p1 = p2;
       
       System.out.println(p1.nome + ":" + p1.idade);
       System.out.println(p2.nome + ":" + p2.idade);
       
       
    }
    
    
    
    
    
    
  
}
