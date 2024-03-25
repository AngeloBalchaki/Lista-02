import java.util.Scanner;

public class Exercicio8 {

    public static void executar() {
        int[] vetor8A = new int[5];
        int[] vetor8B = new int[5];
        int[] vetor8C = new int[10];
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < vetor8A.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor8A[i] = scanner.nextInt();
            vetor8C[i] = vetor8A[i];
        }
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < vetor8B.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor8B[i] = scanner.nextInt();
            vetor8C[i + 5] = vetor8B[i];
        }
        System.out.println("Vetor C (concatenação de A e B): " + Arrays.toString(vetor8C));