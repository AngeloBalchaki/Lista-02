import java.util.Scanner;

public class Exercicio5 {

    public static void executar() {
       
        int[] vetor5 = new int[5];
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor5.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor5[i] = scanner.nextInt();
        }
        System.out.print("Digite um número para contar sua ocorrência no vetor: ");
        int numero = scanner.nextInt();
        int count = 0;
        for (int num : vetor5) {
            if (num == numero) {
                count++;
            }
        }
        System.out.println("O número " + numero + " aparece " + count + " vezes no vetor.");