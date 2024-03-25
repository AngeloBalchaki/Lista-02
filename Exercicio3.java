import java.util.Scanner;

public class Exercicio3 {

    public static void executar() {
        int[] vetor3 = new int[5];
        int[] vetorDobro = new int[5];
        for (int i = 0; i < vetor3.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor3[i] = scanner.nextInt();
            vetorDobro[i] = vetor3[i] * 2;
        }
        System.out.println("Valores do vetor original:");
        for (int num : vetor3) {
            System.out.print(num + " ");
        }
        System.out.println("\nValores do vetor com o dobro:");
        for (int num : vetorDobro) {
            System.out.print(num + " ");
        }
    }
}