package conversaodetempo;
import java.util.Scanner;


public class ConversaoDeTempo {

 
 public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int S, horas, minutos, segundos;
    
     S= input.nextInt();    
     horas = S/3600;
     minutos = S%3600/60;
     segundos= S%60;
     
     System.out.println(horas+":"+minutos+":"+segundos);
    }

   
    }
    

