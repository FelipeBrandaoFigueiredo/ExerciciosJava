/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package produtosimples;

import java.util.Scanner;
        
public class ProdutoSimples {

  
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      
      int valorUm = input.nextInt();
      int valorDois = input.nextInt();
      int PROD = valorUm * valorDois;
      
        System.out.println("PROD = " + PROD );
      
      
      
    }
    
}
