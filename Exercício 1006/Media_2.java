/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package media_2;
import java.util.Scanner;
public class Media_2 {

   
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       double A = input.nextDouble();
        double B = input.nextDouble();
         double C = input.nextDouble();
          double notaA=2;
          double notaB=3;
         double notaC=5;
        double notaTotal= notaA+notaB+notaC;
       double MEDIA = (A*notaA+B*notaB+C*notaC)/notaTotal;
       
        System.out.printf("MEDIA = %.1f\n", MEDIA);
        
        
       
       
      }
    
}
