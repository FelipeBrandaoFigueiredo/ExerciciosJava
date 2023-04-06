package calculosimples;
import java.util.Scanner;

public class CalculoSimples {

   
 public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
    int codPeca, codPeca2, quantPeca,quantPeca2;
    double valorPeca,valorPagar,valorPeca2;
    
    codPeca = input.nextInt(); quantPeca = input.nextInt(); valorPeca = input.nextDouble();
     codPeca2 = input.nextInt(); quantPeca2 = input.nextInt();  valorPeca2 = input.nextDouble();
      valorPagar=(quantPeca*valorPeca)+(quantPeca2*valorPeca2);
       System.out.printf("VALOR A PAGAR: R$ %.2f\n",valorPagar);
   
    }
    
}
