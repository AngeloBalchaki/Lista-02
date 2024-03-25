import java.util.Scanner;

public class Exercicio15 {

    public static void executar() { 
        int[] vetor15 = new int[5];
        System.out.println("Digite os 5 números:");
        vetor15[0] = scanner.nextInt();
        for (int i = 1; i < vetor15.length; i++) {
            System.out.print("Digite o próximo número maior que " + vetor15[i - 1] + ": ");
            int num = scanner.nextInt();
            if (num > vetor15[i - 1]) {
                vetor15[i] = num;
            } else {
                System.out.println("Número inválido! Digite um número maior que " + vetor15[i - 1]);
                i--;
            }
        }
        System.out.print("Vetor preenchido: ");
        for (int num : vetor15) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}