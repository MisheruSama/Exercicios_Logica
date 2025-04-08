import java.util.Scanner;

public class Exercicio_media {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      double A = input.nextDouble();
      double B = input.nextDouble();
      double pesoA = 3.5;
        double pesoB = 7.5;
        double media = (A * pesoA + B * pesoB) / (pesoA + pesoB);
        System.out.println(String.format("MEDIA = %.5f", media));

        
    }
}