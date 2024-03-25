import java.util.Scanner;

public class Exercicio6 {

    public static void executar() {
        double[] notas = new double[5];
        double[] pesos = new double[5];
        System.out.println("Digite as notas do aluno:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        System.out.println("Digite os pesos das notas:");
        for (int i = 0; i < pesos.length; i++) {
            System.out.print("Peso da nota " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
        }
        double somaPonderada = 0;
        double somaPesos = 0;
        for (int i = 0; i < notas.length; i++) {
            somaPonderada += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        double mediaPonderada = somaPonderada / somaPesos;
        System.out.println("Média ponderada: " + mediaPonderada);
    }
}

