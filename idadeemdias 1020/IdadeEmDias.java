package idadeemdias;
import java.util.Scanner;

public class IdadeEmDias {

    
   public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     int S,ano,mes,dia;
     S= input.nextInt();
     ano=S/365;
     S= S%365;
     mes=S/30;
     dia= S%30;
     System.out.println(ano+" ano(s)");
     System.out.println(mes+" mes(es)");
     System.out.println(dia+" dia(s)");
    }
    
}
