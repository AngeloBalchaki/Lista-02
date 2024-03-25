import java.util.Scanner;

public class Exercicio9 {

    public static void executar() {
        int[] vetor9A = new int[5];
        int[] vetor9B = new int[5];
        int[] vetor9C = new int[5];
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < vetor9A.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor9A[i] = scanner.nextInt();
            if (i % 2 == 0) {
                vetor9C[i] = vetor9A[i];
            }