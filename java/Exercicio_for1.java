import java.util.Scanner;
public class Exercicio_for1 {
    static Scanner input = new Scanner(System.in);
    static double salario;
    static double aumento = 0.015;
    static String nome;
    static int ano_inicial;
    static int ano_final;
    static int consulta;


    public static void main(String[] args) {
        int i;

        System.out.println("Bem vindo ao programa de consulta de aumento de salário!");
        System.out.println("Digite o nome do funcionário: ");
        nome = input.nextLine();
        System.out.println("Digite o salário inicial do funcionario na empresa: ");
        salario = input.nextDouble();

        System.out.println("Digite o ano inicial de consulta:");
        ano_inicial = input.nextInt();
        System.out.println("Digite o ano final da consulta: ");
        ano_final = input.nextInt();
        consulta= ano_final - ano_inicial;
        

        for(i=0; i<=consulta; i++){
            System.out.println(String.format("O salário do Funcionário: %s \nNo ano de: %d \nÉ de: %.2f", nome, (ano_inicial+i), salario));
            salario= salario + (salario * (aumento*2));
        }

        

    }
}
