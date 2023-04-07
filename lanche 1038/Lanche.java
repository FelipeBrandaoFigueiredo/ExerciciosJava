package lanche;
import java.util.Scanner;

public class Lanche {

    
public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
     int cachorroquente= 1; int xsalada=2; int XBacon=3; int torradaSimples=4;
      int codigo = input.nextInt();
       int quantidade = input.nextInt();
        double valor;
    
    if(codigo==cachorroquente){
     valor = 4.00;
      }else if (codigo==xsalada){ valor = 4.50;
       }else if(codigo==XBacon){ valor = 5.00;    
        }else if (codigo==torradaSimples){ valor = 2.00;
         }else{valor = 1.50;}
          double total = valor*quantidade;
           System.out.printf("Total: R$ %.2f\n",total);

 }
    
}
