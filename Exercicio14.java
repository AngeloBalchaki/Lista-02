import java.util.Scanner;

public class Exercicio14 {

    public static void executar() {
        int[] vetor14 = new int[5];
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor14.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor14[i] = scanner.nextInt();
        }
        int max = vetor14[0];
        int maxIndex = 0;
        for (int i = 1; i < vetor14.length; i++) {
            if (vetor14[i] > max) {
                max = vetor14[i];
                maxIndex = i;
            }
        }
        int temp = vetor14[vetor14.length - 1];
        vetor14[vetor14.length - 1] = max;
        vetor14[maxIndex] = temp;
        System.out.print("Vetor atualizado: ");
        for (int num : vetor14) {
            System.out.print(num + " ");
        }
        System.out.println();
