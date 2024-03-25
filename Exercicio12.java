import java.util.Scanner;

public class Exercicio12 {

    public static void executar() {
        int[] vetor12 = {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12};
        int produtoParesPositivos = 1;
        for (int num : vetor12) {
            if (num > 0 && num % 2 == 0) {
                produtoParesPositivos *= num;
            }
        }
        System.out.println("Produto dos elementos pares positivos: " + produtoParesPositivos);