import java.util.Scanner;

public class Exercicio_Salario {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int numero = input.nextInt();
            int horas_trabalhadas = input.nextInt();
            double salario_por_hora = input.nextDouble();
            double salario = horas_trabalhadas * salario_por_hora;
            
            System.out.println(String.format("NÚMERO = %d\nSALÁRIO = R$ %.2f",numero,salario));
        }
    }
}
