package consumoexercicio;
import java.util.Scanner;

public class ConsumoExercicio {

   
public static void main(String[] args) {
  Scanner scan = new Scanner (System.in);
 
   

    int x;
     double y,consumo;
      x = scan.nextInt();
      y = scan.nextDouble();
     consumo = x/y;
    System.out.printf("%.3f km/l\n",consumo);
    }
    
}
