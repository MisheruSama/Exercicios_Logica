import java.util.Scanner;
public class Exercicio_combustivel_media {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int X = input.nextInt();
            double Y = input.nextDouble();
            double consumo_medio = X/Y;
            System.out.println(String.format("%.3f km/l", consumo_medio));
        }
    }
}
