/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areacirculo;

import java.util.Scanner;


public class AreaCirculo {

    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14159;
        double raio = input.nextDouble();

        double area = pi*(raio*raio);

        System.out.printf("A=%.4f\n", area);
     
     
    }
    
}
