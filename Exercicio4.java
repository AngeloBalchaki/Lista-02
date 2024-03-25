import java.util.Scanner;

public class Exercicio4 {

    public static void executar() {
        Índices dos elementos inferiores a n
        System.out.println("Problema 4:");
        int[] vetor4 = new int[5];
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor4.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor4[i] = scanner.nextInt();
        }
        System.out.print("Digite um número para comparar: ");
        int n = scanner.nextInt();
        System.out.println("Elementos inferiores a " + n + ":");
        for (int i = 0; i < vetor4.length; i++) {
            if (vetor4[i] < n) {
                System.out.println("Índice " + i + ": " + vetor4[i]);
            }
        }