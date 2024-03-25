import java.util.Scanner;

public class Exercicio10 {

    public static void executar() {
        int[] vetor10A = new int[5];
        int[] vetor10B = new int[5];
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < vetor10A.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor10A[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetor10A.length; i++) {
            vetor10B[i] = vetor10A[vetor10A.length - 1 - i];
        }
        System.out.print("Vetor B (cópia invertida de A): ");
        for (int num : vetor10B) {
            System.out.print(num + " ");
        }
        System.out.println();
