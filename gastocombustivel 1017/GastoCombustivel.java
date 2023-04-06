
package gastocombustivel;
import java.util.Scanner;


public class GastoCombustivel {
   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tempo, velocidade; double distancia, litros;
        tempo = input.nextInt();
        velocidade = input.nextInt();
        
        distancia = tempo*velocidade;
        litros = distancia/12;
        
        System.out.printf("%.3f\n",litros);
        
    }
    
}
