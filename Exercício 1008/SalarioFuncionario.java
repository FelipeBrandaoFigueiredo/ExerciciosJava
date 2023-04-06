/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salariofuncionario;
import java.util.Scanner;

public class SalarioFuncionario {

   
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
     
     int numeroFun, hora;
      double sal, result;
       numeroFun= input.nextInt();
        hora= input.nextInt();
        sal = input.nextDouble();
       result = hora*sal;
      System.out.println("NUMBER = "+numeroFun);
     System.out.printf("SALARY = U$ %.2f",result);
        
    }
    
}
