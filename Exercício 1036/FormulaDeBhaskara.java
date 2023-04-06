package formuladebhaskara;
import java.util.Scanner;

public class FormulaDeBhaskara {
    
 public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
   double A,B,C,delta,denominador,R1,R2;
    A = input.nextDouble();
     B = input.nextDouble();
      C = input.nextDouble();
       delta = Math.pow(B,2) - 4*A*C;
      denominador = 2*A;       
     R1 = (-B+Math.sqrt(delta))/denominador;
    R2 = (-B-Math.sqrt(delta))/denominador; 
     
    if (A == 0 || delta<0){
     System.out.println("Impossivel calcular");       
    } 
    else {
     System.out.printf("R1 = %.5f\n",R1);
      System.out.printf("R2 = %.5f\n",R2);
      }
    
   }  
 
}
