package notasemoedas;

import java.util.Scanner;

public class NotasEMoedas {

public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int cem,cinquenta,vinte,dez,cinco,dois,umreal,cinquentacen,vintecincocen,dezcen,cincocen,umcen;double valor;
    valor = input.nextDouble();
    
        cem = (int)(valor/100);valor%=100;
         cinquenta = (int)(valor/50);valor%=50;
          vinte = (int)(valor/20);valor%=20;
           dez = (int)(valor/10);valor%=10;
            cinco = (int)(valor/5);valor%=5;
             dois = (int)(valor/2);valor%=2;
             umreal = (int)(valor/1);valor%= 1;
            cinquentacen = (int)(valor/0.50);valor%=0.50;
           vintecincocen = (int)(valor/0.25);valor%= 0.25;
          dezcen = (int)(valor/0.10); valor%=0.10;
         cincocen = (int)(valor/0.05); valor%=0.05;
        umcen = (int)valor;
      
        
        
        System.out.println("NOTAS:");
         System.out.println(cem+" nota(s) de R$ 100.00");
          System.out.println(cinquenta+" nota(s) de R$ 50.00");
           System.out.println(vinte+" nota(s) de R$ 20.00");
            System.out.println(dez+" nota(s) de R$ 10.00");
             System.out.println(cinco+" nota(s) de R$ 5.00");
              System.out.println(dois+" nota(s) de R$ 2.00");
              System.out.println("MOEDAS:"); 
             System.out.println(umreal+" moeda(s) de R$ 1.00");
            System.out.println(cinquentacen+" moeda(s) de R$ 0.50");
           System.out.println(vintecincocen+" moeda(s) de R$ 0.25");
          System.out.println(dezcen+" moeda(s) de R$ 0.10");
         System.out.println(cincocen+" moeda(s) de R$ 0.05");
        System.out.println(umcen+" moeda(s) de R$ 0.01");
       
    }
    
}
