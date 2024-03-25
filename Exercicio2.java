import java.util.Scanner;

public class Exercicio2 {

    public static void executar() {
        System.out.print("Digite a quantidade de números que deseja informar: ");
    int quantidade = scanner.nextInt();
    int[] vetor2 = new int[quantidade];
    for (int i = 0; i < vetor2.length; i++) {
        System.out.print("Digite o " + (i + 1) + "º número: ");
        vetor2[i] = scanner.nextInt();
    }
    System.out.println("Análise dos números:");
    for (int i = 0; i < vetor2.length; i++) {
        if (vetor2[i] > 0) {
            System.out.println("O número " + vetor2[i] + " na posição " + i + " é positivo.");
        } else if (vetor2[i] < 0) {
            System.out.println("O número " + vetor2[i] + " na posição " + i + " é negativo.");
        } else {
            System.out.println("O número " + vetor2[i] + " na posição " + i + " é zero.");
        }
    }