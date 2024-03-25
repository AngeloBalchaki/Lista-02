import java.util.Scanner;

public class Exercicio1 {

    public static void executar() { 
        int[] vetor1 = new int[5];
        int soma1 = 0;
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor1[i] = scanner.nextInt();
            soma1 += vetor1[i];
        }
        double media1 = soma1 / (double) vetor1.length;
        System.out.println("Média: " + media1);
        System.out.println("Valores menores, iguais ou superiores à média:");
        for (int num : vetor1) {
            if (num < media1) {
                System.out.println(num + " é menor que a média.");
            } else if (num == media1) {
                System.out.println(num + " é igual à média.");
            } else {
                System.out.println(num + " é superior à média.");
            }
        }
