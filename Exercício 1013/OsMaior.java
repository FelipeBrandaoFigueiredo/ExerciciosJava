package osmaior;
import java.util.Scanner;

public class OsMaior {
 public static void main(String[] args) {
   Scanner input = new Scanner (System.in);
   int a,b,c;  
   a = input.nextInt(); b = input.nextInt(); c = input.nextInt();
   int maior_ab, maior;
   maior_ab =(a+b+Math.abs(a-b))/2;
   maior = (maior_ab+c+Math.abs(maior_ab-c))/2;
   System.out.println(maior+" eh o maior");
 }
    
}
