
// Dado os valores do Alcool e da Gasolina, descubra qual é o melhor, sabendo que a gasolina é 70% mais performatica


/** valor da gasolina * 0.7
 * se menor que o Valor acool
 * gasolina é melhor
 * senao
 * alcool é melhor
 * 
 */
public class CalculoCombustivel
{
    public static void main(String[] args){
        
        double valorGasolina = 4.00;   
        double valorAlcool  = 2.50;
        double respostaGasolina = valorGasolina * 0.7;
        double respostaAlcool = valorAlcool * 0.7;
        
        
        if(respostaGasolina > valorAlcool){
            System.out.println("Gasolina é melhor");
        
        }
        else{
            System.out.println("Alcool é melhor");
        }
    
    
    
    
    
    
    
    
    
    }
}
