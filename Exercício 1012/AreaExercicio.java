/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areaexercicio;

import java.util.Scanner;
public class AreaExercicio {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    double A,B,C,triangulo,pi, circulo,trapezio, quadrado,retangulo;
    A = input.nextDouble(); B = input.nextDouble(); C = input.nextDouble(); pi = 3.14159;
    
    triangulo = (A * C)/2;
     circulo = (C * C)*pi;
      trapezio = ((A + B) * C)/2;
       quadrado = B*B;
        retangulo = A*B;
    
        System.out.printf("TRIANGULO: %.3f\n",triangulo);
       System.out.printf("CIRCULO: %.3f\n",circulo);
      System.out.printf("TRAPEZIO: %.3f\n",trapezio);
     System.out.printf("QUADRADO: %.3f\n",quadrado);
    System.out.printf("RETANGULO: %.3f\n",retangulo);
    }
    
}
