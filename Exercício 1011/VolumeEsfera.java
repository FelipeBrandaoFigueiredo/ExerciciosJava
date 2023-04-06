package volumeesfera;
import java.util.Scanner;
public class VolumeEsfera {

 
    public static void main(String[] args) {
    Scanner barra = new Scanner (System.in);
    
      double raio, pi, volume;
      raio = barra.nextDouble();
      pi =  3.14159;
    volume = (4.0/3)*pi*Math.pow(raio,3);
      
        System.out.printf("VOLUME = %.3f\n",volume);
    }
    
}
