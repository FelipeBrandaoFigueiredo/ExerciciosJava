
package salariocombonus;
import java.util.Scanner;


public class SalarioComBonus {

   
    public static void main(String[] args) {
        
    Scanner input = new Scanner (System.in);
    String nome;
     double sal,venda, total, porcentagem, percentual;
    
     nome=input.next();
      sal=input.nextDouble();
       venda=input.nextDouble();
        porcentagem=15;
         percentual=(venda*porcentagem)/100;
          total=percentual+sal;
       
        System.out.printf("TOTAL = R$ %.2f\n",total);
        
        
        
    }
    
}
