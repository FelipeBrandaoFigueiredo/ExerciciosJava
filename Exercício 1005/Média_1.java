
package média_1;
import java.util.Scanner;

public class Média_1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
                
    double A = input.nextDouble();
    double B = input.nextDouble();
      double notaA = 3.5; 
       double notaB = 7.5;
       double notaTotal = notaA+notaB;
       
       
       double MEDIA = (A*notaA+B*notaB)/notaTotal;
       
       
       System.out.printf("MEDIA = %.5f\n ", MEDIA);
        
    }
    
}
