import java.util.Scanner;

public class Exercicio7 {

    public static void executar() {
        int[] vetor7A = new int[5];
        int[] vetor7B = new int[5];
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < vetor7A.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor7A[i] = scanner.nextInt();
        }
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < vetor7B.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor7B[i] = scanner.nextInt();
        }
        boolean iguais = Arrays.equals(vetor7A, vetor7B);
        if (iguais) {
            System.out.println("Os dois vetores são iguais.");
        } else {
            System.out.println("Os dois vetores são diferentes.");
        }